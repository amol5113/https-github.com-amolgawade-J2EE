package com.cdac.firsthbmapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cdac.firsthbmapp.dto.Clerk;
import com.cdac.firsthbmapp.dto.Employee;
import com.cdac.firsthbmapp.dto.Manager;

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
		
		Manager m = new Manager(103, "Rama", 99999.50, new Date(), 9999.50, 8888.50);
		Clerk c = new Clerk(104, "Shiva", 8888.50, new Date(), 7777.50);
		
		s.save(m);
		s.save(c);
		
		
		t.commit();
		s.flush();
		s.close();
		sf.close();
		
		
	}

}
