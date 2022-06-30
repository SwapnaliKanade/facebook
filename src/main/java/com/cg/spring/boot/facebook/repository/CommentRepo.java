package com.cg.spring.boot.facebook.repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.cg.spring.boot.facebook.model.Comment;

public interface CommentRepo extends CassandraRepository<Comment, UUID>{

	Comment save(Comment comment);
	
	@AllowFiltering
	ArrayList<Comment> findAllByPostID(UUID postID);
}
