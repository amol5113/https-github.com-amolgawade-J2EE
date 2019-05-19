package com.cdac.firsthbmapp;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cdac.firsthbmapp.dto.Employee;

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
		
//		Query q = s.createQuery("from Employee");
	//	Query q = s.createQuery("from Manager");
		Query q = s.createQuery("from Clerk");
		
		List<Employee> li = q.list();
		for(Employee e : li) {
			System.out.println(e);
		}
		
		t.commit();
		s.flush();
		s.close();
		sf.close();
		
		
	}

}
