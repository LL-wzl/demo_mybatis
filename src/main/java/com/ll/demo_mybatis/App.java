package com.ll.demo_mybatis;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ll.demo_mybatis.module.Person;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		InputStream is = App.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession session = sessionFactory.openSession();
		
		String statement = "com.ll.demo_mybatis.dao.PersonMapper.findAll";//映射sql的标识字符串
		
		List<Person> persons = session.selectList(statement);
		
		System.out.println(persons.size());
	}
	
}
