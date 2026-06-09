package com.example.dataJPAdemo.Service;

import com.example.dataJPAdemo.Repository.StudentRepo;
import com.example.dataJPAdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSer {
    @Autowired
    StudentRepo repo;

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
