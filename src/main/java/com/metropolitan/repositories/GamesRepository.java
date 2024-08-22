package com.metropolitan.repositories;

import com.metropolitan.models.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GamesRepository extends JpaRepository<Games, Integer> {
    Games findById(int id);
    List<Games> findByGamesYear(int year);
    List<Games> findBySeason(String season);
}
