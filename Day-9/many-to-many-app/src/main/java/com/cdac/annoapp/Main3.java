package com.cdac.annoapp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cdac.annoapp.dto.Category;
import com.cdac.annoapp.dto.Product;




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
		
		Query q =s.createQuery("from Product");
		List<Product> li = q.list();
		for(Product p : li) {
			System.out.println(p);
			for(Category c : p.getCategories()) {
				System.out.println(c);
			}
		}
		
		t.commit();
		s.flush();
		s.close();
		sf.close();
		
	
	}

}
