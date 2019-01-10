package com.clinicusers.service;

import java.security.Principal;

import com.clinicusers.domain.PrimaryAccount;
import com.clinicusers.domain.SavingsAccount;

public interface AccountService {

	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
}
