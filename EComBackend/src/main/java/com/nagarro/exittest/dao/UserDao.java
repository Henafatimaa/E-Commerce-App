package com.nagarro.exittest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.exittest.models.User;
//Author HenaFatima //

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
