package com.clinicusers.dao;

import org.springframework.data.repository.CrudRepository;

import com.clinicusers.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
