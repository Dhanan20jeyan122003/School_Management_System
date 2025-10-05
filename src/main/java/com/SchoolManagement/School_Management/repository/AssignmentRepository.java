package com.SchoolManagement.School_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolManagement.School_Management.entity.Assignment;

import java.util.List;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findByClassRoomId(Long classRoomId);
}