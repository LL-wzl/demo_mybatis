package com.ll.demo_mybatis.dao;

import java.util.List;

import com.ll.demo_mybatis.module.Person;

public interface PersonMapper {

	List<Person> findAll();
	
}
