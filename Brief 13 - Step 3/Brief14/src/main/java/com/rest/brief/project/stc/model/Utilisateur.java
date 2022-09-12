package com.rest.brief.project.stc.model;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
//@Inheritance(strategy=InheritanceType.JOINED),@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="utilisateur_type")
@Component
public class Utilisateur {
	@Id
  @Column(name = "Id", columnDefinition = "serial")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;

  @Column(name = "nom")
  private String nom;

  @Column(name = "prenom")	
  private String prenom;

  @Column(name = "telephone")
  private String telephone;

  @Column(name = "email")
  private String email;

  @Column(name = "login")
  private String login;

  @Column(name = "pasword")
  private String pasword;
  
  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
          name = "user_roles",
          joinColumns = @JoinColumn(name = "user_id"),
          inverseJoinColumns = @JoinColumn(name = "role_id")
  )
  private Set<Role> roles = new HashSet<>();

 
}