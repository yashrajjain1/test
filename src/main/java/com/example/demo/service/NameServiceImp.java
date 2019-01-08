package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Name;
import com.example.demo.repository.NameRepository;

@Service
public class NameServiceImp implements NameService{

	
	private NameRepository nameRepository;
	
	@Autowired
	public NameServiceImp(NameRepository nameRepository) {
		this.nameRepository = nameRepository;
	}
	
	@Override
	public List<Name> listAll() {
		
		List<Name> name = new ArrayList<>();
		nameRepository.findAll().forEach(name::add); //fun with Java 8
        return name;
	}
}
