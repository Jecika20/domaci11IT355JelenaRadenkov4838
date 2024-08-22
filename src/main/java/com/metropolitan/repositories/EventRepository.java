package com.metropolitan.repositories;

import com.metropolitan.models.Event;
import com.metropolitan.models.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    Event findById(int id);
    List<Event> findByEventNameContaining(String eventName);
    List<Event> findByEventNameStartingWith(String eventName);
    List<Event> findBySportSportName(String sportSportName);
}
