package com.dhanu.spring.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.dhanu.spring.dao.FirstDao;
import com.dhanu.spring.entity.Student_info;


@Component
public class FirstDaoImpl implements FirstDao {

	@Autowired
	private HibernateTemplate HibernateTemplate;

	public String getData() {

		System.out.println("Hi Sharad - Welcome to DaoImpl");
		Student_info student =(Student_info) HibernateTemplate.get(Student_info.class, "1234");
		System.out.println("Hi Sharad - Welcome to DaoImpl");

		// return stu.getName();
		return student.getName();
	}

}
