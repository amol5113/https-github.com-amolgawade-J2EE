package com.cdac.annoapp;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cdac.annoapp.dto.Department;
import com.cdac.annoapp.dto.Employee;




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
		
		Department dept = new Department(20, "it");
		Employee emp = new Employee(102, "shiv");
		emp.setDept(dept);
		
		s.save(dept);
		s.save(emp);
		
		t.commit();
		s.flush();
		s.close();
		sf.close();
		
	
	}

}
