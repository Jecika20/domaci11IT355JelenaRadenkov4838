package com.metropolitan.repositories;

import com.metropolitan.models.Medal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedalRepository extends JpaRepository<Medal, Integer> {
    @Query("SELECT m FROM Medal m WHERE m.medalName LIKE %:name%")
    List<Medal> findMedalsByName(String name);

}
