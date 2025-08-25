package com.example.schoolteacher.services;

import com.example.schoolteacher.entities.Teacher;
import com.example.schoolteacher.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(Long id, Teacher updated) {
        updated.setId(id);
        return teacherRepository.save(updated);
    }

    public Teacher patchTeacherAddress(Long id, String address) {
        Teacher teacher = teacherRepository.findById(id).orElseThrow();
        teacher.setTeacherAddress(address);
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
