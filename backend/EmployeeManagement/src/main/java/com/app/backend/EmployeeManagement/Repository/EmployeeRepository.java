package com.app.backend.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.backend.EmployeeManagement.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
