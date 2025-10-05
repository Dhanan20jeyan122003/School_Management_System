package com.SchoolManagement.School_Management.controller;

import org.springframework.web.bind.annotation.*;

import com.SchoolManagement.School_Management.entity.ClassRoom;
import com.SchoolManagement.School_Management.entity.Notice;
import com.SchoolManagement.School_Management.entity.Subject;
import com.SchoolManagement.School_Management.service.ClassRoomService;
import com.SchoolManagement.School_Management.service.NoticeService;
import com.SchoolManagement.School_Management.service.SubjectService;

import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/public")
public class PublicController {

    private final NoticeService noticeService;
    private final ClassRoomService classRoomService;
    private final SubjectService subjectService;

    public PublicController(NoticeService noticeService, ClassRoomService classRoomService, SubjectService subjectService){
        this.noticeService = noticeService;
        this.classRoomService = classRoomService;
        this.subjectService = subjectService;
    }

    // List all notices
    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getNotices(){
        return ResponseEntity.ok(noticeService.list());
    }

    // List all classes
    @GetMapping("/classes")
    public ResponseEntity<List<ClassRoom>> getClasses(){
        return ResponseEntity.ok(classRoomService.list());
    }

    // List all subjects
    @GetMapping("/subjects")
    public ResponseEntity<List<Subject>> getSubjects(){
        return ResponseEntity.ok(subjectService.list());
    }
}