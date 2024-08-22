package com.metropolitan.sevices;

import com.metropolitan.models.City;
import com.metropolitan.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City getCityById(int id) {
        return cityRepository.findById(id);
    }

    public City getCitiesByName(String name) {
        return cityRepository.findByCityName(name);
    }

    public City createCity(City city) {
        return cityRepository.save(city);

    }
    public City updateCity(City city) {
        return cityRepository.save(city);

    }

    public City deleteCityById(int id) {
        City city = cityRepository.findById(id);
        if(city ==null){
            return null;
        }
        cityRepository.delete(city);
        return city;
    }
}
