package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Name;

public interface NameRepository extends CrudRepository<Name,Integer> {

}
