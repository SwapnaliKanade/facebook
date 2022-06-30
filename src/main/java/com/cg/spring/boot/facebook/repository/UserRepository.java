package com.cg.spring.boot.facebook.repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.cg.spring.boot.facebook.model.User;

public interface UserRepository extends CassandraRepository<User, String> {

	User save(User user);
	ArrayList<User> findAll();
	User findAllByuserID(String userID);
	
}
