package edu.icet.ecom.repository;

import edu.icet.ecom.entity.User;
import edu.icet.ecom.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserRole(UserRole role);

    Optional<User> findByEmail(String email);

    List<User> findAllByUserRole(UserRole userRole);

    List<User> findAllByProjectIdAndUserRole(Long projectId, UserRole userRole);

    Optional<User> findByProjectIdAndUserRole(Long projectId, UserRole userRole);



}

