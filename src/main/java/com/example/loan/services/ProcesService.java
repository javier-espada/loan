package com.example.loan.services;

import com.example.loan.models.Loan;
import com.example.loan.models.User;
import org.springframework.stereotype.Service;

import static com.example.loan.models.Status.*;

public class ProcesService extends Thread{

    private final User user;
    private final Loan loan;

    public ProcesService(User user, Loan loan) {
        this.user = user;this.loan = loan;
    }

    public void run(){
        if((user.getCreditScore() - TestUserService.existingUnpaidLoans(user.getId()))*30 < 600 || user.getIncome()*5 < loan.getAmount()) {
            loan.setStatus(REJECTED);
        } else {
            loan.setStatus(OPEN);
        }
    }
}