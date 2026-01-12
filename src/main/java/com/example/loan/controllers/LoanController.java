package com.example.loan.controllers;

import com.example.loan.models.Loan;
import com.example.loan.models.User;
import com.example.loan.services.LoanService;
import com.example.loan.services.ProcesService;
import com.example.loan.services.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoanController {
    private TestUserService testUserService;
    private LoanService loanService;

    @Autowired
    public LoanController(TestUserService testUserService, LoanService loanService) {this.testUserService = testUserService;}

    @PostMapping
    public Loan createLoan(@RequestParam double amount, @RequestParam int repaymentPeriod, @RequestBody User user) {
       Loan loan = loanService.createLoan(amount, repaymentPeriod, user);
       ProcesService loanProcess = new ProcesService (user,loan);
       loanProcess.start();
       return loan;
    }



}