package edu.icet.ecom.dto;


import edu.icet.ecom.enums.UserRole;
import lombok.Data;

@Data
public class UserDTO {

    private long id;

    private String email;

    private String password;

    private String name;

    private UserRole userRole;

    private Long projectId;

    private String projectName;
}
