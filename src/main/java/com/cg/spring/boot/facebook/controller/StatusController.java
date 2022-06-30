package com.cg.spring.boot.facebook.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.facebook.model.Status;
import com.cg.spring.boot.facebook.services.StatusService;
@CrossOrigin
@RestController
@RequestMapping("/user/statusService")
public class StatusController {
	
	@Autowired
	StatusService statusService;
	
	@PostMapping("/save")
	public Status saveStatus(@RequestBody Status status) {
		return statusService.saveStatus(status);
	}
	
	
	@GetMapping("/getAllStatus")
	public ArrayList<Status> getAllStatus() {
		return statusService.getAllStatus();
	}
}
