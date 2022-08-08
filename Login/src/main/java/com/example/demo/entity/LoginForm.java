package com.example.demo.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Admin")
public class LoginForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "ussername")
	private String ussername;
	@Column(name = "password")
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUssername() {
		return ussername;
	}
	public void setUssername(String ussername) {
		this.ussername = ussername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginForm() {
		super();
	}
	public LoginForm(String ussername, String password,long id) {
		super();
		this.ussername = ussername;
		this.password = password;
		this.id = id;
	}
	@Override
	public String toString() {
		return "LoginForm [id=" + id + ", ussername=" + ussername + ", password=" + password + "]";
	}
}
