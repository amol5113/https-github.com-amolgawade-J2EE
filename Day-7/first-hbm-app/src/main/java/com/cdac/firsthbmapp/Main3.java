package com.cdac.firsthbmapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cdac.firsthbmapp.dto.Employee;

public class Main3 {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		ServiceRegistry sr = ssrb.build();
		
		SessionFactory sf = cfg.buildSessionFactory(sr);
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee emp = new Employee(104, "mohan",98799.50f, new Date());
		
		s.update(emp);
		
		t.commit();
		s.flush();
		s.close();
		sf.close();
		
		
	}

}
