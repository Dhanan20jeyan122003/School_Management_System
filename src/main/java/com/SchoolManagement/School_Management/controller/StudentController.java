package com.SchoolManagement.School_Management.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolManagement.School_Management.entity.Attendence;
import com.SchoolManagement.School_Management.entity.Mark;
import com.SchoolManagement.School_Management.service.AssignmentService;
import com.SchoolManagement.School_Management.service.AttendenceService;
import com.SchoolManagement.School_Management.service.MarkService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
private final AttendenceService attendanceService;
private final MarkService markService;
private final AssignmentService assignmentService;


public StudentController(AttendenceService attendanceService, MarkService markService, AssignmentService assignmentService){
this.attendanceService = attendanceService; this.markService = markService; this.assignmentService = assignmentService;
}


@GetMapping("/attendance/{studentId}")
public ResponseEntity<List<Attendence>> myAttendance(@PathVariable Long studentId){ return ResponseEntity.ok(attendanceService.forStudent(studentId)); }


@GetMapping("/marks/{studentId}")
public ResponseEntity<List<Mark>> myMarks(@PathVariable Long studentId){ return ResponseEntity.ok(markService.forStudent(studentId)); }


// assignment submission endpoint (files: left as TODO - implement multipart upload)
@PostMapping("/assignments/{assignmentId}/submit")
public ResponseEntity<String> submitAssignment(@PathVariable Long assignmentId){
return ResponseEntity.ok("Submission endpoint - implement file upload");
}


public AssignmentService getAssignmentService() {
	return assignmentService;
}
}