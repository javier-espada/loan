package com.example.loan.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name="loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double amount;
    private boolean paid = false;
    private int repaymentPeriod;
    private Status status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Loan() {}
    public Loan(double amount, int repaymentPeriod, User user) {
        this.amount = amount;
        this.repaymentPeriod = repaymentPeriod;
        this.user = user;
        this.status = Status.OPEN;
    }

    public long getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public boolean isPaid() {
        return paid;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getRepaymentPeriod() {
        return repaymentPeriod;
    }
    public void setRepaymentPeriod(int repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
