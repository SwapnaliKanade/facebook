package com.cg.spring.boot.facebook.repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.cg.spring.boot.facebook.model.Status;

public interface StatusRepo extends CassandraRepository<Status, UUID> {

	Status save(Status status);
	ArrayList<Status> findAll();
}
