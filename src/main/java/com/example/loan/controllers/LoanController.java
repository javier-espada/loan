package com.example.loan.controllers;

import com.example.loan.models.Loan;
import com.example.loan.services.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {
    private TestUserService testUserService;

    @Autowired
    public LoanController(TestUserService testUserService) {this.testUserService = testUserService;}

    @PostMapping
    public Loan createLoan(@RequestBody Loan loan) {
        return loan;
    }

}