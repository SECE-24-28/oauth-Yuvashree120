package com.example.CrudByJpa.service;

import com.example.CrudByJpa.Dto.StudentDto;
import com.example.CrudByJpa.model.Student;
import com.example.CrudByJpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository sr;
    @GetMapping("students")
    public List<Student> getAllStudents(){
        return sr.findAll();
    }

    public void addStudent(Student std) {
        sr.save(std);
    }

    public Student getStudentByRollNo(int roll) {
        return sr.findById(roll).orElse(new Student());
    }

    public void updateStudent(Student std) {
        sr.save(std);
    }

    public void deleteAllStudents() {
        sr.deleteAll();
    }

    public void deleteStudentsByRollNo(int roll) {
        sr.deleteById(roll);
    }

    public List<Student> getStudentByGenderAndTech(String gender, String tech) {
        return sr.findByGenderAndTech(gender,tech);
    }

    public List<Student> getStuByNameAndTech(String name, String tech) {
        return sr.getStuByNameAndTech(name,tech);
    }

    public List<Student> getBytech(String tech) {
        return sr.findByTech(tech);
    }

    public List<Student> getStudentByGenAndTech(String gender, String tech) {
        return sr.findByGenAndTech(gender,tech);
    }

    public StudentDto AllStudent(int roll) {
        Student s1 = sr.findById(roll).orElseThrow();
        return convertStuToDto(s1);

    }
    public StudentDto convertStuToDto(Student s1){
        StudentDto std = new StudentDto();
        std.setRno
        std.setName(s1.getName());
        std.setGender(s1.getGender());
        std.setTech(s1.getTech());
        std.setEmail(s1.getEmail());
        return std;
    }


    public StudentDto addStudents( StudentDto std) {
        Student student = sr.save(convertDtoToStu(std));
        return convertStuToDto(student);

    }
    public Student convertDtoToStu(StudentDto std){
        Student s2 = new Student();
        s2.setRno(std.getRno());
        s2.setName(std.getName());
        s2.setGender(std.getGender());
        s2.setTech(std.getTech());
        s2.setEmail(std.getEmail());
        return s2;
    }
}
