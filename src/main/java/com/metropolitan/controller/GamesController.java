package com.metropolitan.controller;

import com.metropolitan.models.Games;
import com.metropolitan.models.Message;
import com.metropolitan.sevices.GamesService;
import com.metropolitan.sevices.MessageProducerService;
import jakarta.jms.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GamesController {
    @Autowired
    private GamesService gamesService;

    @Autowired
    private MessageProducerService messageProducerService;

    @GetMapping
    public ResponseEntity<List<Games>> getAllGames() {
        Message message = new Message("Get all games" , "GAMES_GETALL");
        messageProducerService.sendMessage(message);
       return new ResponseEntity<List<Games>>(gamesService.getAllGames(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Games> getGameById(@PathVariable int id) {
      Games games= gamesService.getGamesById(id);
      if(games!=null){
          return new ResponseEntity<Games>(games, HttpStatus.OK);
      }
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

     @GetMapping("/year")
    public ResponseEntity<List<Games>> getGamesByYear(@RequestParam("year") int year) {
        return new ResponseEntity<List<Games>>(gamesService.getGamesByYear(year), HttpStatus.OK);
    }

    @GetMapping("/season")
    public ResponseEntity<List<Games>> getGamesBySeason(@RequestParam("season") String season) {
           return new ResponseEntity<>(gamesService.getGamesBySeason(season), HttpStatus.OK);
    }
}
