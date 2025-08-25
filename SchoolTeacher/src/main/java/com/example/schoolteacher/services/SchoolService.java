package com.example.schoolteacher.services;

import com.example.schoolteacher.entities.School;
import com.example.schoolteacher.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public Optional<School> getSchoolById(Long id) {
        return schoolRepository.findById(id);
    }

    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    public School updateSchool(Long id, School updated) {
        updated.setId(id);
        return schoolRepository.save(updated);
    }

    public void deleteSchool(Long id) {
        schoolRepository.deleteById(id);
    }
}