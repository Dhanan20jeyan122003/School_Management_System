package com.SchoolManagement.School_Management.service;

import org.springframework.stereotype.Service;

import com.SchoolManagement.School_Management.entity.Notice;
import com.SchoolManagement.School_Management.repository.NoticeRepository;

import java.util.List;

@Service
public class NoticeService {
    private final NoticeRepository repo;

    public NoticeService(NoticeRepository repo) { this.repo = repo; }

    public Notice create(Notice n) { return repo.save(n); }

    public List<Notice> list() { return repo.findAll(); }
}