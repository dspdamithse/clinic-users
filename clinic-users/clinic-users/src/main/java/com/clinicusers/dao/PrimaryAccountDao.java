package com.clinicusers.dao;

import org.springframework.data.repository.CrudRepository;

import com.clinicusers.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
