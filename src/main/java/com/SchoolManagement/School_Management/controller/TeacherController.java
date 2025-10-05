package com.SchoolManagement.School_Management.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolManagement.School_Management.entity.Assignment;
import com.SchoolManagement.School_Management.entity.Attendence;
import com.SchoolManagement.School_Management.entity.Mark;
import com.SchoolManagement.School_Management.service.AssignmentService;
import com.SchoolManagement.School_Management.service.AttendenceService;
import com.SchoolManagement.School_Management.service.MarkService;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
private final AttendenceService attendanceService;
private final AssignmentService assignmentService;
private final MarkService markService;


public TeacherController(AttendenceService attendanceService, AssignmentService assignmentService, MarkService markService){
this.attendanceService = attendanceService; this.assignmentService = assignmentService; this.markService = markService;
}


@PostMapping("/attendance")
public ResponseEntity<Attendence> markAttendance(@RequestBody Attendence a){ return ResponseEntity.ok(attendanceService.mark(a)); }


@PostMapping("/assignments")
public ResponseEntity<Assignment> createAssignment(@RequestBody Assignment a){ return ResponseEntity.ok(assignmentService.create(a)); }


@PostMapping("/marks")
public ResponseEntity<Mark> uploadMark(@RequestBody Mark m){ return ResponseEntity.ok(markService.save(m)); }
}