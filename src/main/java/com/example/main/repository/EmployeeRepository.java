package com.example.main.repository;

import com.example.main.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = """
        SELECT 
            e.employee_id AS employeeId,
            e.first_name AS firstName,
            e.last_name AS lastName,
            j.job_title AS jobTitle,
            d.department_name AS departmentName,
            l.city AS city,
            l.postal_code AS postalCode,
            e.salary AS salary
        FROM 
            employees e
            INNER JOIN jobs j ON e.job_id = j.job_id
            INNER JOIN departments d ON e.department_id = d.department_id
            INNER JOIN locations l ON d.location_id = l.location_id
        ORDER BY 
            e.employee_id
        """, nativeQuery = true)
    List<EmployeeDto> obtenerEmpleados();
}
