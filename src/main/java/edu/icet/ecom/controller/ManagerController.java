package edu.icet.ecom.controller;

import edu.icet.ecom.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/managers")
@CrossOrigin(origins = "*")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("/employees/{projectId}")
    public ResponseEntity<?> getAllEmployeesByProject(@PathVariable Long projectId){
        try {
            return  ResponseEntity.ok(managerService.getAllEmployeesByProject(projectId));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }


}