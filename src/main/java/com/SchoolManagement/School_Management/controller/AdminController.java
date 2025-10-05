package com.SchoolManagement.School_Management.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.SchoolManagement.School_Management.entity.ClassRoom;
import com.SchoolManagement.School_Management.entity.Notice;
import com.SchoolManagement.School_Management.entity.Subject;
import com.SchoolManagement.School_Management.entity.User;
import com.SchoolManagement.School_Management.service.ClassRoomService;
import com.SchoolManagement.School_Management.service.NoticeService;
import com.SchoolManagement.School_Management.service.SubjectService;
import com.SchoolManagement.School_Management.service.UserService;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/api/admin")
public class AdminController {
private final UserService userService;
private final ClassRoomService classRoomService;
private final SubjectService subjectService;
private final NoticeService noticeService;


public AdminController(UserService userService, ClassRoomService classRoomService, SubjectService subjectService, NoticeService noticeService){
this.userService = userService;
this.classRoomService = classRoomService;
this.subjectService = subjectService;
this.noticeService = noticeService;
}


@PostMapping("/users")
public ResponseEntity<User> createUser(@RequestBody User user){
return ResponseEntity.ok(userService.createUser(user));
}


@GetMapping("/users")
public ResponseEntity<List<User>> listUsers(){ return ResponseEntity.ok(userService.list()); }


@PostMapping("/classrooms")
public ResponseEntity<ClassRoom> createClass(@RequestBody ClassRoom c){ return ResponseEntity.ok(classRoomService.create(c)); }


@PostMapping("/subjects")
public ResponseEntity<Subject> createSubject(@RequestBody Subject s){ return ResponseEntity.ok(subjectService.create(s)); }


@PostMapping("/notices")
public ResponseEntity<Notice> createNotice(@RequestBody Notice n){ n.setPostedAt(LocalDateTime.now()); return ResponseEntity.ok(noticeService.create(n)); }
}