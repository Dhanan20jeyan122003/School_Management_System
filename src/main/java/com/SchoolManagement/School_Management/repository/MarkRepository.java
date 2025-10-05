package com.SchoolManagement.School_Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolManagement.School_Management.entity.Mark;

public interface MarkRepository extends JpaRepository<Mark, Long> {
    List<Mark> findByStudentId(Long studentId);
}