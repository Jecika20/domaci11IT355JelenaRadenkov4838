package com.metropolitan.repositories;

import com.metropolitan.models.City;
import com.metropolitan.models.Games;
import com.metropolitan.models.GamesCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GamesCityRepository extends JpaRepository<GamesCity, Integer> {
    List<GamesCity> findByGames(Games games);
    List<GamesCity> findByCity(City city);
}
