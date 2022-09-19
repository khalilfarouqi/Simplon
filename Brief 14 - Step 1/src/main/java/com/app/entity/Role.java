package com.app.entity;

public enum Role {
	
	ADMIN ("Admin"),
	CLIENT ("Client");
	
	private final String Name;

	private Role(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}
	
}
