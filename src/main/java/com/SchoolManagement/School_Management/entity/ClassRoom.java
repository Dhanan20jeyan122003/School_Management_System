package com.SchoolManagement.School_Management.entity;



import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ClassRoom {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name; // e.g., Grade 10-A
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
public ClassRoom() {
	super();
	// TODO Auto-generated constructor stub
}
public ClassRoom(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}


}