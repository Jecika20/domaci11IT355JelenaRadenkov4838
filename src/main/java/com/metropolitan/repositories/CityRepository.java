package com.metropolitan.repositories;

import com.metropolitan.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    City findById(int id);
    City findByCityName(String cityName);

}
