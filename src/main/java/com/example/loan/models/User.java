package com.example.loan.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    private long id;

    private String firstName;
    private String lastName;
    private int creditScore;
    private double income;

    @OneToMany
    private List<Loan> loans;

    public User(){}
    public User(long id, String firstName, String lastName, int creditScore, double income) {}
}
