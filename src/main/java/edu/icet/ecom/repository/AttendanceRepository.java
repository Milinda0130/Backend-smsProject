package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {


    Optional<Attendance> findByEmployeeIdAndProjectIdAndDate(Long employeeId, Long projectId, LocalDate date);
}
