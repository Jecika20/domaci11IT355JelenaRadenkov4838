package com.metropolitan.models;

import jakarta.persistence.*;

@Entity
public class GamesCity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="games_id")
    private Games games;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;

    public GamesCity() {
    }

    public GamesCity(int id, Games games, City city) {
        this.id = id;
        this.games = games;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "GamesCity{" +
                "id=" + id +
                ", games=" + games +
                ", city=" + city +
                '}';
    }
}
