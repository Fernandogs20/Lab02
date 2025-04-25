package com.example.main.controller;

import com.example.main.repository.EmployeeDto;
import com.example.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee_list")
    public String mostrarEmpleados(Model model) {
        List<EmployeeDto> empleados = employeeRepository.obtenerEmpleados();
        model.addAttribute("empleados", empleados);
        return "employee_list";
    }
}
