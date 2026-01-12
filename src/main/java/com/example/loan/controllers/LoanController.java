package com.example.loan.controllers;

import com.example.loan.models.Loan;
import com.example.loan.services.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LoanController {
    private TestUserService testUserService;

    @Autowired
    public LoanController(TestUserService testUserService) {this.testUserService = testUserService;}

}