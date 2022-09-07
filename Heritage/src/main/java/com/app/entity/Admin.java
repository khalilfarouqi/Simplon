package com.app.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Admins")
@EqualsAndHashCode(callSuper = true)
@Data
public class Admin extends User {
	
	
	

}
