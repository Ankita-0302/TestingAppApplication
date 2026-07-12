package com.Ankita.TestingApp.TestingAppApplication.services;


import com.Ankita.TestingApp.TestingAppApplication.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto getEmployeeById(Long id);
    EmployeeDto createNewEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);
    void deleteEmployee(Long id);


}
