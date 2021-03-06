package com.clinicusers.dao;

import org.springframework.data.repository.CrudRepository;

import com.clinicusers.domain.User;

public interface UserDao extends CrudRepository<User, Long>
{
	User findByUsername(String username);
    User findByEmail(String email);
}
