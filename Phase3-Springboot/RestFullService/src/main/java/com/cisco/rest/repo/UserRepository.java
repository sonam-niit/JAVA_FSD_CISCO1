package com.cisco.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.rest.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
