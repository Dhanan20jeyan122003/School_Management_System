package com.SchoolManagement.School_Management.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Notice {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String title;
@Column(length=5000)
private String content;
private LocalDateTime postedAt;
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
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public LocalDateTime getPostedAt() {
	return postedAt;
}
public void setPostedAt(LocalDateTime postedAt) {
	this.postedAt = postedAt;
}
public Notice(Long id, String title, String content, LocalDateTime postedAt) {
	super();
	this.id = id;
	this.title = title;
	this.content = content;
	this.postedAt = postedAt;
}
public Notice() {
	super();
	// TODO Auto-generated constructor stub
}


}