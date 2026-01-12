package com.example.loan.services;

import com.example.loan.models.Loan;
import com.example.loan.models.Status;
import com.example.loan.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    public LoanService() {
    }

    public Loan createLoan(double amount, int repaymentPeriod, User user) {
        Loan loan = new Loan(amount, repaymentPeriod, user);
        return loan;
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
