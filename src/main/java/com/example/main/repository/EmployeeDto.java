package com.example.main.repository;

public interface EmployeeDto {

    Integer getEmployeeId();    // El identificador del empleado
    String getFirstName();      // Nombre
    String getLastName();       // Apellido
    String getJobTitle();       // Puesto
    String getDepartmentName(); // Departamento
    String getCity();           // Ciudad
    String getPostalCode();     // Código Postal
    Double getSalary();         // Salario
}
