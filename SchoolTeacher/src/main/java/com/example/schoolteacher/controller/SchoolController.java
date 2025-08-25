package com.example.schoolteacher.controller;

import com.example.schoolteacher.entities.School;
import com.example.schoolteacher.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @GetMapping("/{id}")
    public Optional<School> getSchool(@PathVariable Long id) {
        return schoolService.getSchoolById(id);
    }

    @PostMapping("/addNewSchool")
    public School create(@RequestBody School school) {
        return schoolService.createSchool(school);
    }

    @PutMapping("/{id}")
    public School update(@PathVariable Long id, @RequestBody School school) {
        return schoolService.updateSchool(id, school);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        schoolService.deleteSchool(id);
    }
}
