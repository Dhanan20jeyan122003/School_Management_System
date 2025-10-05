package com.SchoolManagement.School_Management.service;


import org.springframework.stereotype.Service;

import com.SchoolManagement.School_Management.entity.FeePayment;
import com.SchoolManagement.School_Management.repository.FeePaymentRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FeePaymentService {
    private final FeePaymentRepository repo;

    public FeePaymentService(FeePaymentRepository repo) { this.repo = repo; }

    public FeePayment pay(FeePayment f) {
        f.setPaidAt(LocalDateTime.now());
        return repo.save(f);
    }

    public List<FeePayment> forStudent(Long studentId) {
        return repo.findByStudentId(studentId);
    }
}

