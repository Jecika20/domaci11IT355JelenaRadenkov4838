package com.metropolitan.sevices;

import com.metropolitan.models.Games;
import com.metropolitan.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<Games> getAllGames() {
        return gamesRepository.findAll();
    }

    public Games getGamesById(int id){
        return gamesRepository.findById(id);
    }

    public List<Games> getGamesByYear(int year){
        return gamesRepository.findByGamesYear(year);
    }

    public List<Games> getGamesBySeason(String season){
        return gamesRepository.findBySeason(season);
    }
}
