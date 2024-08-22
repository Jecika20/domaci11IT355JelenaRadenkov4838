package com.metropolitan.controller;

import com.metropolitan.models.City;
import com.metropolitan.sevices.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable int id) {
        return new ResponseEntity<City>( cityService.getCityById(id), HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<City> getCityByName(@RequestParam("name") String name) {
        return new ResponseEntity<City>(cityService.getCitiesByName(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<City> createCity(@RequestBody City newCity) {
        City city = cityService.createCity(newCity);
        if(city != null) {
            return new ResponseEntity<City>(city, HttpStatus.OK);
        }
        return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
    }

    @PutMapping
    public ResponseEntity<City> updateCity(@RequestBody City newCity) {
        City city = cityService.updateCity(newCity);
        if(city != null) {
            return new ResponseEntity<City>(city, HttpStatus.OK);
        }
        return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<City>deleteCityById(@PathVariable int id) {
          City city = cityService.deleteCityById(id);
          if(city != null) {
              return new ResponseEntity<City>(city, HttpStatus.OK);
          }
          return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
    }
}
