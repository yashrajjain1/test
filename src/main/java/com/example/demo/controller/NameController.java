package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.NameServiceImp;

@RestController
public class NameController {
	
	@Autowired
	private NameServiceImp nameServiceImp;
	
	@RequestMapping("/names")
	public void displayNames() {
		nameServiceImp.listAll();
	}
	
}
