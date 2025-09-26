package edu.icet.ecom.controller;

import edu.icet.ecom.dto.AttendanceDTO;
import edu.icet.ecom.dto.LeaveRequestDTO;
import edu.icet.ecom.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attendance")
@CrossOrigin(origins = "*")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/add")
    public ResponseEntity<?> markAttendance(@RequestBody AttendanceDTO dto){
        try {
            return  ResponseEntity.ok(attendanceService.markAttendance(dto));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PostMapping("/add/leave")
    public ResponseEntity<?> applyLeave(@RequestBody LeaveRequestDTO dto){
        try {
            return  ResponseEntity.ok(attendanceService.applyLeave(dto));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/leaves/employee/{id}")
    public ResponseEntity<?> getAllEmployeesLeaves(@PathVariable Long id){
        try{
            return ResponseEntity.ok(attendanceService.getAllEmployeeLeaves(id));

        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
