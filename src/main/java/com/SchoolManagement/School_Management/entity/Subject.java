package com.SchoolManagement.School_Management.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Subject {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;

public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}