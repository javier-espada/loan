package com.example.loan.services;

import com.example.loan.models.Loan;
import com.example.loan.models.Status;
import com.example.loan.models.User;

import java.util.Optional;

public class LoanService {

    public LoanService() {
    }

    public Loan createLoan(double amount, int repaymentPeriod, User user) {
        return new Loan(amount, repaymentPeriod, user);
    }

    public Loan paidLoan(long idLoan, User user) {
        Optional<Loan> optionalLoan = user.getLoans().stream()
                .filter(loan -> loan.getId().equals(idLoan))
                .findFirst();
        if (optionalLoan.isPresent()) {
            Loan loan = optionalLoan.get();
            loan.setPaid(true);
            loan.setStatus(Status.CLOSED);
            return loan;
        }
        return null;
    }

}
