package com.clinicusers.dao;

import org.springframework.data.repository.CrudRepository;

import com.clinicusers.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
