package com.SchoolManagement.School_Management.service;

import org.springframework.stereotype.Service;

import com.SchoolManagement.School_Management.entity.Assignment;
import com.SchoolManagement.School_Management.repository.AssignmentRepository;

import java.util.List;


@Service
public class AssignmentService {
private final AssignmentRepository repo;
public AssignmentService(AssignmentRepository repo){ this.repo = repo; }
public Assignment create(Assignment a){ return repo.save(a); }
public List<Assignment> getForClass(Long classId){ return repo.findByClassRoomId(classId); }
}