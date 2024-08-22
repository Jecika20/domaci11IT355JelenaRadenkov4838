package com.metropolitan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medal {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String medalName;

    public Medal() {
    }

    public Medal(int id, String medal_name) {
        this.id = id;
        this.medalName = medal_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedalName() {
        return medalName;
    }

    public void setMedalName(String medal_name) {
        this.medalName = medal_name;
    }

    @Override
    public String toString() {
        return "Medal{" +
                "id=" + id +
                ", medalName='" + medalName + '\'' +
                '}';
    }
}
