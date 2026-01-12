package com.example.loan.models;

public class Loan {
    private static Long id = 0L;
    private Double amount;
    private boolean paid = false;
    private Integer repaymentPeriod;
    private Status status;

    private User user;

    public Loan() {}
    public Loan(double amount, int repaymentPeriod, User user) {
        id++;
        this.amount = amount;
        this.repaymentPeriod = repaymentPeriod;
        this.user = user;
        this.status = Status.PENDING;
    }

    public Long getId() {
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
