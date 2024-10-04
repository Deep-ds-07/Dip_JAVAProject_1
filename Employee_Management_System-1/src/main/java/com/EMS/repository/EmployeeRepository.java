package com.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EMS.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
