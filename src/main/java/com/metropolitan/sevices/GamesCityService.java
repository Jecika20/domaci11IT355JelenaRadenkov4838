package com.metropolitan.sevices;

import com.metropolitan.models.City;
import com.metropolitan.models.Games;
import com.metropolitan.models.GamesCity;
import com.metropolitan.repositories.GamesCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesCityService {

    @Autowired
    private GamesCityRepository gamesCityRepository;

    public List<GamesCity> getByGames(Games games) {
        return gamesCityRepository.findByGames(games);
    }

    public List<GamesCity> getByCity(City city) {
        return gamesCityRepository.findByCity(city);
    }
}
