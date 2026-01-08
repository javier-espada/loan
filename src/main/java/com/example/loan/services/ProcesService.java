package com.example.loan.services;

import com.example.loan.models.Loan;

public class ProcesService extends Thread{

    private final Loan loan;

    public ProcesService(Loan loan) {
        this.loan = loan;
    }

    public void run(){

    }
}
