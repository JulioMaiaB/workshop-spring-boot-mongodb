package com.juliobeani.workshopmongo.dto;

import com.juliobeani.workshopmongo.domain.User;

public class UserDTO {
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO () {}
	
	public UserDTO (User obj) {
		this.id = obj.getId();
		this.name = obj.getName();
		this.email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
