package com.SchoolManagement.School_Management.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.Set;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class User {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String username;
private String password;
private String fullName;
private String email;


public User() {
	super();
	// TODO Auto-generated constructor stub
}


public User(Long id, String username, String password, String fullName, String email, Set<String> roles) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.fullName = fullName;
	this.email = email;
	this.roles = roles;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getFullName() {
	return fullName;
}


public void setFullName(String fullName) {
	this.fullName = fullName;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public Set<String> getRoles() {
	return roles;
}


public void setRoles(Set<String> roles) {
	this.roles = roles;
}

@ElementCollection(fetch = FetchType.EAGER)
@CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
@Column(name = "role")
private Set<String> roles; // ADMIN, TEACHER, STUDENT, PARENT
}