package com.example.loan.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static long id = 0L;

    private String firstName;
    private String lastName;
    private Integer creditScore;
    private Double income;

    private List<Loan> loans = new ArrayList<>();

    public User(){}
    public User(String firstName, String lastName, double income) {
        id++;
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
