package edu.icet.ecom.entity;



import edu.icet.ecom.dto.AttendanceDTO;
import edu.icet.ecom.enums.AttendanceStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private AttendanceStatus attendanceStatus;

    @ManyToOne
    private Project project;

    @ManyToOne
    private  User employee;

    @ManyToOne
    private User manager;

    public AttendanceDTO getDto(){
        AttendanceDTO dto = new AttendanceDTO();

        dto.setId(id);
        dto.setDate(date);
        dto.setAttendanceStatus(attendanceStatus);

        dto.setProjectId(project.getId());
        dto.setProjectName(project.getName());

        dto.setEmployeeId(employee.getId());
        dto.setEmployeeName(employee.getName());

        dto.setManagerId(manager.getId());
        dto.setManagerName(manager.getName());

        return  dto;
    }
}
