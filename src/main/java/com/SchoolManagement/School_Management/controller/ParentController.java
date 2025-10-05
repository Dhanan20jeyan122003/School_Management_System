package com.SchoolManagement.School_Management.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolManagement.School_Management.entity.FeePayment;
import com.SchoolManagement.School_Management.entity.Mark;
import com.SchoolManagement.School_Management.service.AttendenceService;
import com.SchoolManagement.School_Management.service.FeePaymentService;
import com.SchoolManagement.School_Management.service.MarkService;

@RestController
@RequestMapping("/api/parent")
public class ParentController {
private final MarkService markService;
private final AttendenceService attendanceService;
private final FeePaymentService feePaymentService;


public ParentController(MarkService markService, AttendenceService attendanceService, FeePaymentService feePaymentService){
this.markService = markService; this.attendanceService = attendanceService; this.feePaymentService = feePaymentService;
}


@GetMapping("/child/{studentId}/marks")
public ResponseEntity<List<Mark>> childMarks(@PathVariable Long studentId){ return ResponseEntity.ok(markService.forStudent(studentId)); }


@PostMapping("/child/{studentId}/pay")
public ResponseEntity<FeePayment> payFees(@PathVariable Long studentId, @RequestBody FeePayment payment){ payment.setStudentId(studentId); return ResponseEntity.ok(feePaymentService.pay(payment)); }


public AttendenceService getAttendanceService() {
	return attendanceService;
}
}