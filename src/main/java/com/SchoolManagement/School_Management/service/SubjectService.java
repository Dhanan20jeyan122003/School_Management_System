package com.SchoolManagement.School_Management.service;

import org.springframework.stereotype.Service;

import com.SchoolManagement.School_Management.entity.Subject;
import com.SchoolManagement.School_Management.repository.SubjectRepository;

import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepository repo;

    public SubjectService(SubjectRepository repo) { this.repo = repo; }

    public Subject create(Subject s) { return repo.save(s); }

    public List<Subject> list() { return repo.findAll(); }
}