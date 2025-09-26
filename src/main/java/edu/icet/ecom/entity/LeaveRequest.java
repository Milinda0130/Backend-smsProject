package edu.icet.ecom.entity;



import edu.icet.ecom.dto.LeaveRequestDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private Boolean status;

    @ManyToOne
    private Project project;

    @ManyToOne
    private  User employee;

    @ManyToOne
    private User manager;

    public LeaveRequestDTO getDto(){
        LeaveRequestDTO dto = new LeaveRequestDTO();

        dto.setId(id);
        dto.setDate(date);
        dto.setStatus(status);

        dto.setProjectId(project.getId());
        dto.setProjectName(project.getName());

        dto.setEmployeeId(employee.getId());
        dto.setEmployeeName(employee.getName());

        dto.setManagerId(manager.getId());
        dto.setManagerName(manager.getName());

        return dto;
    }
}
