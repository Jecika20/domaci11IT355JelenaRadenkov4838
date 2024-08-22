package com.metropolitan.repositories;

import com.metropolitan.models.GamesCompetitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GamesCompetitorRepository extends JpaRepository<GamesCompetitor, Integer> {
    List<GamesCompetitor> findByGamesId(int gamesId);
    List<GamesCompetitor> findByPersonId(int personId);
}
