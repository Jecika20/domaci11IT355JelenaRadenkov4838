package com.metropolitan.models;

import jakarta.persistence.*;

@Entity
public class GamesCompetitor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int age;

    @ManyToOne
    @JoinColumn(name="games_id")
    private Games games;

    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;

    public GamesCompetitor() {
    }

    public GamesCompetitor(int id, int age, Games games, Person person) {
        this.id = id;
        this.age = age;
        this.games = games;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "GamesCompetitor{" +
                "id=" + id +
                ", age=" + age +
                ", games=" + games +
                ", person=" + person +
                '}';
    }
}
