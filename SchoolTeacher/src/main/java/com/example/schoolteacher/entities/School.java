package com.example.schoolteacher.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolName;
    private String schoolAddress;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Teacher> teachers;

    

    public School() {
    }

    public School(Long id, String schoolName, String schoolAddress, List<Teacher> teachers) {
        this.id = id;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.teachers = teachers;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
