package com.example.CrudByJpa.controller;


import com.example.CrudByJpa.Dto.StudentDto;
import com.example.CrudByJpa.model.Student;
import com.example.CrudByJpa.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService s;

    @GetMapping("student")
    public List<Student> getAllStudents() {
        return s.getAllStudents();
    }

    //@PostMapping("students")
    // public String addStudent(@Valid @RequestBody Student std){
    //    s.addStudent(std);
    //    return "added";
    //}
//    @GetMapping("students/{rno}")
//    public Student getStudentByRollNo(@PathVariable("rno") int roll) {
//        return s.getStudentByRollNo(roll);
//    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student std) {
        s.updateStudent(std);
        return "updated";
    }

    @DeleteMapping("students")
    public String deleteAllStudents() {
        s.deleteAllStudents();
        return "deleted successfully";
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudentByRollNo(@PathVariable("rno") int roll) {
        s.deleteStudentsByRollNo(roll);
        return "deleted";
    }

    @GetMapping("students/custom")
    public List<Student> getStudentByGenderAndTech(
            @Param("gender") String gender,
            @Param("tech") String tech
    ) {
        return s.getStudentByGenderAndTech(gender, tech);
    }

    @GetMapping("Student/cust")
    public List<Student> getStuByNameAndTech(
            @Param("name") String name,
            @Param("tech") String tech
    ) {
        return s.getStuByNameAndTech(name, tech);
    }

    @GetMapping("Student/tech/{tech}")
    public List<Student> getBytech(@PathVariable String tech) {
        return s.getBytech(tech);
    }

    @PostMapping("students/filter")
    public List<Student> getStudentByGenAndTech(
            @Param("gender") String gender,
            @Param("tech") String tech
    ) {
        return s.getStudentByGenAndTech(gender, tech);
    }

    @GetMapping("students/{rno}")
    public StudentDto getAllStudent(@PathVariable("rno") int roll) {
        return s.AllStudent(roll);
    }

    @PostMapping("students")
    public StudentDto addStudent(@Valid @RequestBody StudentDto std) {
        return s.addStudents(std);

    }

}
