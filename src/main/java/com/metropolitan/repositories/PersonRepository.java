package com.metropolitan.repositories;

import com.metropolitan.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Query("SELECT p FROM Person p WHERE p.height >= :minHeight AND p.height <= :maxHeight")
    List<Person> findByHeightRange(int minHeight, int maxHeight);

    @Query("SELECT p FROM Person p WHERE p.weight >= :minWeight AND p.weight <= :maxWeight")
    List<Person> findByWeightRange(int minWeight, int maxWeight);

}
