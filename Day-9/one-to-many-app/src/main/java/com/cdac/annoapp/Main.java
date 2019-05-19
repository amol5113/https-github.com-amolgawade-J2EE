package com.cdac.annoapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cdac.annoapp.dto.Course;
import com.cdac.annoapp.dto.Student;


public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		ServiceRegistry sr = ssrb.build();
		
		SessionFactory sf = cfg.buildSessionFactory(sr);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Course c = new Course(30, "spring");
		Student std = new Student(105, "ramesh");
		Student std1 = new Student(106, "harish");
		
		c.getStudents().add(std);
		c.getStudents().add(std1);
		
		s.save(c);
		s.save(std);
		s.save(std1);
		t.commit();
		s.flush();
		s.close();
		sf.close();
		
	
	}

}
