package edu.icet.ecom.service;

import edu.icet.ecom.dto.UserDTO;
import edu.icet.ecom.entity.User;
import edu.icet.ecom.enums.UserRole;
import edu.icet.ecom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManagerService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllEmployeesByProject(Long projectId){
        List<User> users = userRepository.findAllByProjectIdAndUserRole(projectId, UserRole.EMPLOYEE);
        return users.stream().map(User::getDto).collect(Collectors.toList());
    }
}

