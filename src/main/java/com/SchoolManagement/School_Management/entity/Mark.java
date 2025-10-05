package com.SchoolManagement.School_Management.entity;



import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Mark {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Long studentId;
private Long subjectId;
private Long examId; // optional
private Double score;
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
public Long getSubjectId() {
	return subjectId;
}
public void setSubjectId(Long subjectId) {
	this.subjectId = subjectId;
}
public Long getExamId() {
	return examId;
}
public void setExamId(Long examId) {
	this.examId = examId;
}
public Double getScore() {
	return score;
}
public void setScore(Double score) {
	this.score = score;
}
public Mark() {
	super();
	// TODO Auto-generated constructor stub
}
public Mark(Long id, Long studentId, Long subjectId, Long examId, Double score) {
	super();
	this.id = id;
	this.studentId = studentId;
	this.subjectId = subjectId;
	this.examId = examId;
	this.score = score;
}


}
