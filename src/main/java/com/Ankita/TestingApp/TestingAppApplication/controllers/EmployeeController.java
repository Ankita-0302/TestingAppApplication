package com.Ankita.TestingApp.TestingAppApplication.controllers;


import com.Ankita.TestingApp.TestingAppApplication.dto.EmployeeDto;
import com.Ankita.TestingApp.TestingAppApplication.exceptions.ResourceNotFoundException;
import com.Ankita.TestingApp.TestingAppApplication.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping(path = "/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
        EmployeeDto employeeDto = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employeeDto);
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> createNewEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto createEmployeeDto = employeeService.createNewEmployee(employeeDto);
        return new ResponseEntity<>(createEmployeeDto, HttpStatus.CREATED);
    }


    @PutMapping(path = "/{id}")
    public ResponseEntity<EmployeeDto> updateEmployeeById(@PathVariable Long id ,@RequestBody EmployeeDto employeeDto) {
       EmployeeDto createdEmployeeDto=employeeService.updateEmployee(id,employeeDto);

        return new ResponseEntity<>(createdEmployeeDto,HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
       employeeService.deleteEmployee(id);
        return ResponseEntity.notFound().build();
    }



}










