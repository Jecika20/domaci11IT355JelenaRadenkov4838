package com.metropolitan.repositories;

import com.metropolitan.models.CompetitorEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompetitorEventRepository extends JpaRepository<CompetitorEvent, Integer> {
    List<CompetitorEvent> findByEventEventName(String eventName);
}
