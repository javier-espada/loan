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

    public long getId() {
        return id;
    }

    public double  getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public List<Loan> getLoans() {
        return loans;
    }
}
