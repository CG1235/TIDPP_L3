package com.example.VotingSystem.entities;




import javax.persistence.*;


@Table(name="candidates")
@Entity

public class Candidate {
    @Id

    @SequenceGenerator(
            name = "candidate_sequence",
            sequenceName = "candidate_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tcandidate_sequence"
    )
    @Column(name = "id")
    private int id;
    @Column(name = "candidate_name")
    private String name;

    @Column(name = "numberOfVotes")
    private int numberofVotes;

    public Candidate(String name, int numberofVotes) {
        this.name = name;
        this.numberofVotes = numberofVotes;
    }

    public Candidate() {
    }

    public Candidate(int id, String name, int numberofVotes) {
        this.id = id;
        this.name = name;
        this.numberofVotes = numberofVotes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberofVotes() {
        return numberofVotes;
    }

    public void setNumberofVotes(int numberofVotes) {
        this.numberofVotes = numberofVotes;
    }
}
