package com.cdac.annoapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cdac.annoapp.dto.Category;
import com.cdac.annoapp.dto.Product;


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
		
		Category c10 = new Category(10, "electronic");
		Category c20 = new Category(20, "electric");
		
		Product p1 = new Product(1, "fan");
		Product p2 = new Product(2, "pc");
		Product p3 = new Product(3, "mobile");
		
		c10.getProducts().add(p1);
		c10.getProducts().add(p2);
		
		c20.getProducts().add(p2);
		c20.getProducts().add(p3);
		
		p1.getCategories().add(c10);
		p2.getCategories().add(c10);
		p2.getCategories().add(c20);
		p3.getCategories().add(c20);
		
		s.save(c10);
		s.save(c20);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		t.commit();
		s.flush();
		s.close();
		sf.close();
		
	
	}

}
