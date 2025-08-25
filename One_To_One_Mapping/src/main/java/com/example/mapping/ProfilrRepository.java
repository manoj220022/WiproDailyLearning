package com.example.mapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfilrRepository extends JpaRepository<Profile, Long> {

}
