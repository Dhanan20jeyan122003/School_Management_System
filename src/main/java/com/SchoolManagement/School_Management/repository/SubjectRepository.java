package com.SchoolManagement.School_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolManagement.School_Management.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> { }