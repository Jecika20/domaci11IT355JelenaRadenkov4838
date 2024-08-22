package com.metropolitan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NocRegion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String noc;
    private String regionName;

    public NocRegion() {
    }

    public NocRegion(String noc, int id, String regionName) {
        this.noc = noc;
        this.id = id;
        this.regionName = regionName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoc() {
        return noc;
    }

    public void setNoc(String noc) {
        this.noc = noc;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return "NocRegion{" +
                "id=" + id +
                ", noc='" + noc + '\'' +
                ", regionName='" + regionName + '\'' +
                '}';
    }
}
