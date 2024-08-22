package com.metropolitan.repositories;

import com.metropolitan.models.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends JpaRepository<Sport, Integer> {
    Sport findBySportName(String sportName);

}
