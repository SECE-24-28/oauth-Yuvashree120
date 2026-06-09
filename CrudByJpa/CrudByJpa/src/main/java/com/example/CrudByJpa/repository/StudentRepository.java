package com.example.CrudByJpa.repository;

import com.example.CrudByJpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findByGenderAndTech(String gender,String tech);

    List<Student> getStuByNameAndTech(String name, String tech);
    List<Student> findByTech(String tech);

    @Query(nativeQuery = true,value="SELECT * FROM Student where gender=:gender And tech =:tech")
    List<Student> findByGenAndTech(String gender,String tech);

}
