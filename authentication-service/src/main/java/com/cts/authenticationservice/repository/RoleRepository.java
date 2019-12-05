package com.cts.authenticationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.authenticationservice.model.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {

}
