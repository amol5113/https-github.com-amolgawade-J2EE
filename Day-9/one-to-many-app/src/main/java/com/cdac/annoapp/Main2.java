package com.cdac.annoapp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cdac.annoapp.dto.Course;
import com.cdac.annoapp.dto.Student;

public class Main2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		ServiceRegistry sr = ssrb.build();
		
		SessionFactory sf = cfg.buildSessionFactory(sr);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Query q = s.createQuery("from Course");
		List<Course> li = q.list();
		for(Course c : li) {
			System.out.println(c);
			for(Student std : c.getStudents()) {
				System.out.println(std);
			}
		}
		t.commit();
		s.flush();
		s.close();
		sf.close();
	}

}
