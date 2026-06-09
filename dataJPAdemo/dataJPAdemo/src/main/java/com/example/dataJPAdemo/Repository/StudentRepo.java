package com.example.dataJPAdemo.Repository;

import com.example.dataJPAdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
