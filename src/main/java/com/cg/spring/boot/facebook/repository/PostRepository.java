package com.cg.spring.boot.facebook.repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.facebook.model.Post;

@Repository
public interface PostRepository extends CassandraRepository<Post, UUID> {

	ArrayList<Post> findAll();
	Post save(Post post);
	void deleteById(UUID postID);
	
}
