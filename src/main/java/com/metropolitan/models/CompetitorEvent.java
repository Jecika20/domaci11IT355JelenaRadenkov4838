package com.metropolitan.models;

import jakarta.persistence.*;

@Entity
public class CompetitorEvent {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name="competitor_id")
    private GamesCompetitor gamesCompetitor;

    @ManyToOne
    @JoinColumn(name="medal_id")
    private Medal medal;

    public CompetitorEvent() {
    }

    public CompetitorEvent(int id, Event event, GamesCompetitor gamesCompetitor, Medal medal) {
        this.id = id;
        this.event = event;
        this.gamesCompetitor = gamesCompetitor;
        this.medal = medal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public GamesCompetitor getGamesCompetitor() {
        return gamesCompetitor;
    }

    public void setGamesCompetitor(GamesCompetitor gamesCompetitor) {
        this.gamesCompetitor = gamesCompetitor;
    }

    public Medal getMedal() {
        return medal;
    }

    public void setMedal(Medal medal) {
        this.medal = medal;
    }

    @Override
    public String toString() {
        return "CompetitorEvent{" +
                "id=" + id +
                ", event=" + event +
                ", gamesCompetitor=" + gamesCompetitor +
                ", medal=" + medal +
                '}';
    }
}
