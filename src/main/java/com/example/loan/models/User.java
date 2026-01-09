package com.example.loan.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private int creditScore;
    private double income;

    @OneToMany(mappedBy="user", cascade=CascadeType.ALL)
    private List<Loan> loans = new ArrayList<>();

    public User(){}
    public User(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.creditScore = 700;
    }
}
