package com.SchoolManagement.School_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolManagement.School_Management.entity.Attendence;

import java.util.List;

public interface AttendenceRepository extends JpaRepository<Attendence, Long> {
    List<Attendence> findByStudentId(Long studentId);
}
