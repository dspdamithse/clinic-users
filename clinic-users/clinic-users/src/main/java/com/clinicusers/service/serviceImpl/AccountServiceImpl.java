package com.clinicusers.service.serviceImpl;

import java.math.BigDecimal;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicusers.dao.PrimaryAccountDao;
import com.clinicusers.dao.SavingsAccountDao;
import com.clinicusers.domain.PrimaryAccount;
import com.clinicusers.domain.SavingsAccount;
import com.clinicusers.service.AccountService;
import com.clinicusers.service.UserService;

@Service
public class AccountServiceImpl implements AccountService {
	
	private static int nextAccountNumber = 11223145;

    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private SavingsAccountDao savingsAccountDao;

    @Autowired
    private UserService userService;
    

    public PrimaryAccount createPrimaryAccount() {
        PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(new BigDecimal(0.0));
        primaryAccount.setAccountNumber(accountGen());

        primaryAccountDao.save(primaryAccount);

        return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
    }

    public SavingsAccount createSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(new BigDecimal(0.0));
        savingsAccount.setAccountNumber(accountGen());

        savingsAccountDao.save(savingsAccount);

        return savingsAccountDao.findByAccountNumber(savingsAccount.getAccountNumber());
    }
    
    private int accountGen() {
        return ++nextAccountNumber;
    }

	@Override
	public void deposit(String accountType, double amount, Principal principal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(String accountType, double amount, Principal principal) {
		// TODO Auto-generated method stub
		
	}

	

}
