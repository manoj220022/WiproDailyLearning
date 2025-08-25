package com.example.schoolteacher.controller;

import com.example.schoolteacher.entities.Teacher;
import com.example.schoolteacher.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public Optional<Teacher> getTeacher(@PathVariable Long id) {
        return teacherService.getTeacherById(id);
    }

    @PostMapping
    public Teacher create(@RequestBody Teacher teacher) {
        return teacherService.createTeacher(teacher);
    }

    @PutMapping("/{id}")
    public Teacher update(@PathVariable Long id, @RequestBody Teacher teacher) {
        return teacherService.updateTeacher(id, teacher);
    }

    @PatchMapping("/{id}/address")
    public Teacher patchAddress(@PathVariable Long id, @RequestBody String address) {
        return teacherService.patchTeacherAddress(id, address);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
    }
}
