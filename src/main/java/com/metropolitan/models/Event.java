package com.metropolitan.models;

import jakarta.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String eventName;

    @ManyToOne
    @JoinColumn(name="sport_id")
    private Sport sport;

    public Event() {
    }

    public Event(int id, String eventName, Sport sport) {
        this.id = id;
        this.eventName = eventName;
        this.sport = sport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", sport=" + sport +
                '}';
    }
}
