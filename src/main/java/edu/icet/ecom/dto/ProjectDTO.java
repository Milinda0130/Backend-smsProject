package edu.icet.ecom.dto;


import lombok.Data;

import java.util.Date;

@Data
public class ProjectDTO {

    private Long id;

    private String name;

    private  String duration;

    private Date startDate;

}
