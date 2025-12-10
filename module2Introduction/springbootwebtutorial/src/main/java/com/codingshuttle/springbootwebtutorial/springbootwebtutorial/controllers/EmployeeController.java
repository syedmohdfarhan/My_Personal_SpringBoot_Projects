package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.controllers;


import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.entities.EmployeeEntity;
import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.repositories.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping (path = "/employees")
public class EmployeeController {
//  @GetMapping(path="/getSecretMessage")
//    public String getMySuperSecretMessage(){
//      return "Secret message: anfal";
//  }
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(path = "/{employeeId}")
    public Optional<EmployeeEntity> getEmployeeId(@PathVariable Long employeeId){
        return employeeRepository.findById(employeeId);
    }
    @GetMapping
    public List<EmployeeEntity> getAllEmployees (@RequestParam (required = false, name="inputAge") Integer age){
        return employeeRepository.findAll();
    }
//    @PostMapping
//    public String createNewEmployee(){
//        return "hello created";
//    }

    //NOTE: Spring Boot does not allow two methods to handle the exact same HTTP method + URL.
    @PostMapping
    public EmployeeEntity createNewEmployees(@RequestBody EmployeeEntity inputEmployee){
        return employeeRepository.save(inputEmployee);

    }
    @PutMapping
    public String updateEmployeeById(){
        return "Hello from put";
    }
}










