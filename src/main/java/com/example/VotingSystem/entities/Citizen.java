package com.example.VotingSystem.entities;

import javax.persistence.*;



@Table(name="citizens")
@Entity

public class Citizen {

    @Id
    @SequenceGenerator(
            name = "citizen_sequence",
            sequenceName = "citizen_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "citizen_sequence"
    )

    private int id;
    private String username;
    private String lastName;
    private Boolean hasVoted;
    private String IDC;
    private String city;
    private String street;

    public Citizen(String username, String lastName, Boolean hasVoted, String IDC, String city, String street) {
        this.username = username;
        this.lastName = lastName;
        this.hasVoted = hasVoted;
        this.IDC = IDC;
        this.city = city;
        this.street = street;
    }

    public Citizen() {
    }

    public Citizen(int id, String username, String lastName, Boolean hasVoted, String IDC, String city, String street) {
        this.id = id;
        this.username = username;
        this.lastName = lastName;
        this.hasVoted = hasVoted;
        this.IDC = IDC;
        this.city = city;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(Boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public String getIDC() {
        return IDC;
    }

    public void setIDC(String IDC) {
        this.IDC = IDC;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}

