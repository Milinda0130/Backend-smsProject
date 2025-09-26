package edu.icet.ecom.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class LeaveRequestDTO {

    private Long id;

    private LocalDate date;

    private Boolean status;

    private Long ProjectId;
    private String ProjectName;

    private Long EmployeeId;
    private String EmployeeName;

    private Long ManagerId;
    private String ManagerName;
}

