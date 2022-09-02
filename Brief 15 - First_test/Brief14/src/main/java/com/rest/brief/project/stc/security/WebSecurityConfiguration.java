package com.rest.brief.project.stc.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.rest.brief.project.stc.userDetails.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Bean
    public UserDetailsService userDetailsService() {
        return new CustomUserDetailsService();
    }
     
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
         
        return authProvider;
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
	        .authorizeRequests()
            .antMatchers("/admin/**").hasAuthority("administrateur")
            .antMatchers("/responsable/**").hasAuthority("administrateur")
            .antMatchers("/paricipant/**").hasAnyAuthority("administrateur", "RESPONSABLE")
            .antMatchers(HttpMethod.POST,"/exercice/**").hasAnyAuthority("administrateur", "RESPONSABLE")
            .antMatchers(HttpMethod.GET,"/exercice/**").hasAnyAuthority("administrateur", "RESPONSABLE","PARTICIPANT")
            .antMatchers("/activite/**").hasAnyAuthority("administrateur", "RESPONSABLE")
            .antMatchers(HttpMethod.GET,"/activite/**").hasAnyAuthority("administrateur", "RESPONSABLE","PARTICIPANT")

            .anyRequest().authenticated()
            .and()
            .formLogin().permitAll()
            .and()
            .logout().permitAll()
            .and()
            .exceptionHandling().accessDeniedPage("/403")
            ;
    }
}
