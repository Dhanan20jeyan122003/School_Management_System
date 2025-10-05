package com.SchoolManagement.School_Management.service;

import org.springframework.stereotype.Service;

import com.SchoolManagement.School_Management.entity.ClassRoom;
import com.SchoolManagement.School_Management.repository.ClassRoomRepository;

import java.util.List;

@Service
public class ClassRoomService {
    private final ClassRoomRepository repo;

    public ClassRoomService(ClassRoomRepository repo) {
        this.repo = repo;
    }

    public ClassRoom create(ClassRoom c) { return repo.save(c); }

    public List<ClassRoom> list() { return repo.findAll(); }

    public void delete(Long id) { repo.deleteById(id); }
}