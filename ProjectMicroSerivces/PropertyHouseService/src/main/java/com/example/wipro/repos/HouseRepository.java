package com.example.wipro.repos;

import com.example.wipro.entities.House;
import com.example.wipro.enums.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HouseRepository extends JpaRepository<House, Long> {

    @Query("SELECT h FROM House h JOIN h.facilities f WHERE f = :facility")
    List<House> findByFacility(Facility facility);
}

