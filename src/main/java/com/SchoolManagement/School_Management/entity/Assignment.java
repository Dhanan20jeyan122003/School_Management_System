package com.SchoolManagement.School_Management.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Assignment {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String title;
@Column(length=4000)
private String description;
private LocalDate dueDate;


// relations (simplified)
private Long classRoomId;
private Long subjectId;
private Long teacherId;



public Assignment() {
	super();
	// TODO Auto-generated constructor stub
}
public Assignment(Long id, String title, String description, LocalDate dueDate, Long classRoomId, Long subjectId,
		Long teacherId) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.dueDate = dueDate;
	this.classRoomId = classRoomId;
	this.subjectId = subjectId;
	this.teacherId = teacherId;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public LocalDate getDueDate() {
	return dueDate;
}
public void setDueDate(LocalDate dueDate) {
	this.dueDate = dueDate;
}
public Long getClassRoomId() {
	return classRoomId;
}
public void setClassRoomId(Long classRoomId) {
	this.classRoomId = classRoomId;
}
public Long getSubjectId() {
	return subjectId;
}
public void setSubjectId(Long subjectId) {
	this.subjectId = subjectId;
}
public Long getTeacherId() {
	return teacherId;
}
public void setTeacherId(Long teacherId) {
	this.teacherId = teacherId;
}

}