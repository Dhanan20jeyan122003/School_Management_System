package com.SchoolManagement.School_Management.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Attendence {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Long studentId;
private LocalDate date;
private boolean present;
private Long classRoomId;


public Attendence() {
	super();
	// TODO Auto-generated constructor stub
}
public Attendence(Long id, Long studentId, LocalDate date, boolean present, Long classRoomId) {
	super();
	this.id = id;
	this.studentId = studentId;
	this.date = date;
	this.present = present;
	this.classRoomId = classRoomId;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getStudentId() {
	return studentId;
}
public void setStudentId(Long studentId) {
	this.studentId = studentId;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public boolean isPresent() {
	return present;
}
public void setPresent(boolean present) {
	this.present = present;
}
public Long getClassRoomId() {
	return classRoomId;
}
public void setClassRoomId(Long classRoomId) {
	this.classRoomId = classRoomId;
}


}