package com.SchoolManagement.School_Management.service;

import org.springframework.stereotype.Service;

import com.SchoolManagement.School_Management.entity.Attendence;
import com.SchoolManagement.School_Management.repository.AttendenceRepository;

import java.util.List;

@Service
public class AttendenceService {
    private final AttendenceRepository repo;

    public AttendenceService(AttendenceRepository repo) { this.repo = repo; }

    public Attendence mark(Attendence a) { return repo.save(a); }

    public List<Attendence> forStudent(Long studentId) { return repo.findByStudentId(studentId); }

    public List<Attendence> listAll() { return repo.findAll(); }
}