package com.metropolitan.controller;


import com.metropolitan.models.City;
import com.metropolitan.models.Games;
import com.metropolitan.models.GamesCity;
import com.metropolitan.sevices.CityService;
import com.metropolitan.sevices.GamesCityService;
import com.metropolitan.sevices.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gamescity")
public class GamesCityController {
    @Autowired
    private GamesCityService gamesCityService;
    @Autowired
    private GamesService gamesService;
    @Autowired
    private CityService cityService;

    @GetMapping("/byGames/{gamesId}")
    public ResponseEntity<List<GamesCity>> getByGames(@PathVariable int gamesId){
        Games games=gamesService.getGamesById(gamesId);
        if(games!=null){
            return ResponseEntity.ok(gamesCityService.getByGames(games));
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/byCity/{cityId}")
    public ResponseEntity<List<GamesCity>> getByCity(@PathVariable int cityId){
       City city=cityService.getCityById(cityId);
        if(city!=null){
            return ResponseEntity.ok(gamesCityService.getByCity(city));
        }
        return ResponseEntity.notFound().build();
    }
}
