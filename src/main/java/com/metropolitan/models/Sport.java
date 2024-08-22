package com.metropolitan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sport {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String sportName;

    public Sport() {
    }

    public Sport(int id, String sport_name) {
        this.id = id;
        this.sportName = sport_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sport_name) {
        this.sportName = sport_name;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "id=" + id +
                ", sportName='" + sportName + '\'' +
                '}';
    }
}
