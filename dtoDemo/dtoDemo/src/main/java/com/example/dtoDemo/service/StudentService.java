package com.example.dtoDemo.service;

import com.example.dtoDemo.dto.StudentRequestDTO;
import com.example.dtoDemo.dto.StudentResponseDTO;
import com.example.dtoDemo.model.Student;
import com.example.dtoDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public StudentResponseDTO addStudent(StudentRequestDTO dto) {

        Student s1 = new Student();

        s1.setName(dto.getName());
        s1.setGender(dto.getGender());
        s1.setTech(dto.getTech());
        s1.setEmail(dto.getEmail());
        s1.setPassword(dto.getPassword());

        Student savedStudent = repo.save(s1);

        StudentResponseDTO response = new StudentResponseDTO();

        response.setRno(savedStudent.getRno());
        response.setName(savedStudent.getName());
        response.setGender(savedStudent.getGender());
        response.setTech(savedStudent.getTech());
        response.setEmail(savedStudent.getEmail());

        return response;
    }
}