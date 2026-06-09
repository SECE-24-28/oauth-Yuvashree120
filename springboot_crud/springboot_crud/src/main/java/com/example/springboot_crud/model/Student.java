package com.example.springboot_crud.model;

public class Student {
    private int rno;
    private String name;
    private String tech;

    public Student() {
    }

    public Student(int rno, String name, String tech) {
        this.rno = rno;
        this.name = name;
        this.tech = tech;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public String getTech() {
        return tech;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}