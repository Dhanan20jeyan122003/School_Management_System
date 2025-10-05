package com.SchoolManagement.School_Management.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class FeePayment {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Long studentId;
private Double amount;
private LocalDateTime paidAt;
private String paymentReference;
public FeePayment() {
	super();
	// TODO Auto-generated constructor stub
}
public FeePayment(Long id, Long studentId, Double amount, LocalDateTime paidAt, String paymentReference) {
	super();
	this.id = id;
	this.studentId = studentId;
	this.amount = amount;
	this.paidAt = paidAt;
	this.paymentReference = paymentReference;
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
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public LocalDateTime getPaidAt() {
	return paidAt;
}
public void setPaidAt(LocalDateTime paidAt) {
	this.paidAt = paidAt;
}
public String getPaymentReference() {
	return paymentReference;
}
public void setPaymentReference(String paymentReference) {
	this.paymentReference = paymentReference;
}


}