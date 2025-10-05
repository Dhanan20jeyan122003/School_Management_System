package com.SchoolManagement.School_Management.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolManagement.School_Management.entity.FeePayment;

import java.util.List;

public interface FeePaymentRepository extends JpaRepository<FeePayment, Long> {
    List<FeePayment> findByStudentId(Long studentId);
}
