package com.example.schoolteacher.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import com.example.schoolteacher.entities.Qualification;


@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teacherName;
    private String teacherAddress;

    @Enumerated(EnumType.STRING)
    private Qualification qualification;

    private int age;
    private LocalDate dob;
    private int experience;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;


    public Teacher() {
       
    }

    public Teacher(Long id, String teacherName, String teacherAddress,
                   Qualification qualification, int age, LocalDate dob,
                   int experience, School school) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherAddress = teacherAddress;
        this.qualification = qualification;
        this.age = age;
        this.dob = dob;
        this.experience = experience;
        this.school = school;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
