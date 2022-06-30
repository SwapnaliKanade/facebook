package com.cg.spring.boot.facebook.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.facebook.model.Comment;
import com.cg.spring.boot.facebook.model.User;
import com.cg.spring.boot.facebook.repository.CommentRepo;

@Service
public class CommentService {

	@Autowired
	CommentRepo commentRepo;
	
	@Autowired
	UserService userService;
	
	public Comment saveComment(Comment comment) {
		Date date=new Date();
		long time=date.getTime();
		Timestamp dateTime=new Timestamp(time);
		
		comment.setCommentID(UUID.randomUUID());
		comment.setTimestamp(dateTime);
		return commentRepo.save(comment);
	}
	
	public ArrayList<Comment> getAllComment(UUID postID){
		ArrayList<Comment> result=new ArrayList<Comment>();
		result=commentRepo.findAllByPostID(postID);
		return result;
	}
}
