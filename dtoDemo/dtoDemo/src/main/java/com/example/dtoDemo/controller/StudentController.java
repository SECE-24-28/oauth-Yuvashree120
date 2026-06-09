package com.example.dtoDemo.controller;

import com.example.dtoDemo.dto.StudentRequestDTO;
import com.example.dtoDemo.dto.StudentResponseDTO;
import com.example.dtoDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping
    public StudentResponseDTO addStudent(
            @RequestBody StudentRequestDTO dto){
        return service.addStudent(dto);
    }
}
