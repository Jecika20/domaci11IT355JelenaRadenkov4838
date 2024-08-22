package com.metropolitan.models;

import jakarta.persistence.*;

@Entity
public class PersonRegion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;

    @ManyToOne
    @JoinColumn(name="Regeion_id")
    private NocRegion nocRegion;


    public PersonRegion() {
    }

    public PersonRegion(int id, Person person, NocRegion nocRegion) {
        this.id = id;
        this.person = person;
        this.nocRegion = nocRegion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public NocRegion getNocRegion() {
        return nocRegion;
    }

    public void setNocRegion(NocRegion nocRegion) {
        this.nocRegion = nocRegion;
    }

    @Override
    public String toString() {
        return "PersonRegion{" +
                "id=" + id +
                ", person=" + person +
                ", nocRegion=" + nocRegion +
                '}';
    }
}
