package com.example.schoolteacher.repositories;

import com.example.schoolteacher.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
    
	
}