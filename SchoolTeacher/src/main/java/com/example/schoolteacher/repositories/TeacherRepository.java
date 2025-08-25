package com.example.schoolteacher.repositories;

import com.example.schoolteacher.entities.Qualification;
import com.example.schoolteacher.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    // Custom derived query method
    List<Teacher> findByQualification(Qualification qualification);

    // Custom method using JPQL
    @Query("SELECT t FROM Teacher t WHERE t.age > :age")
    List<Teacher> findTeachersOlderThan(int age);

    // Native SQL queries
    @Query(value = "SELECT * FROM teacher WHERE experience > ?1", nativeQuery = true)
    List<Teacher> findExperiencedTeachers(int minExperience);

    @Query(value = "SELECT * FROM teacher WHERE teacher_address LIKE ?1", nativeQuery = true)
    List<Teacher> findTeachersByAddress(String keyword);

}