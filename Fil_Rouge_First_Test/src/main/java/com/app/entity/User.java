package com.app.entity;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {
	
	private Long ID;
	
	private String FullName;
	
	private String Email;
	
	private String Password;

}
