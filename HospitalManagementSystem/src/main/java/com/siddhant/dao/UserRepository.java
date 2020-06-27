package com.siddhant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddhant.pojos.User;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByUsername(String username);
}
