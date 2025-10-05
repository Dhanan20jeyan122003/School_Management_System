package com.SchoolManagement.School_Management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SchoolManagement.School_Management.entity.Mark;
import com.SchoolManagement.School_Management.repository.MarkRepository;

@Service
public class MarkService {
    private final MarkRepository repo;

    public MarkService(MarkRepository repo) { this.repo = repo; }

    public Mark save(Mark m) { return repo.save(m); }

    public List<Mark> forStudent(Long studentId) { return repo.findByStudentId(studentId); }
}