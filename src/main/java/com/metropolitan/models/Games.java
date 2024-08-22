package com.metropolitan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Games {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int gamesYear;
    private String gamesName;
    private String season;

    public Games() {
    }

    public Games(int id, int games_year, String games_name, String season) {
        this.id = id;
        this.gamesYear = games_year;
        this.gamesName = games_name;
        this.season = season;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGamesYear() {
        return gamesYear;
    }

    public void setGamesYear(int games_year) {
        this.gamesYear = games_year;
    }

    public String getGamesName() {
        return gamesName;
    }

    public void setGamesName(String games_name) {
        this.gamesName = games_name;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", gamesYear=" + gamesYear +
                ", gamesName='" + gamesName + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
