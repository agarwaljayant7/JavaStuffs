package com.jayant.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		
		emp.setEno(111);
		emp.setEname("Jayant");
		emp.setEsal(500);
		emp.setEaddr("Bangalore");
		
		int eno = (Integer)session.save(emp);
		tx.commit();
		
		if(eno == 111)
		{
			System.out.println("Employee record inserted successfully");
		}
		else {
				System.out.println("Record insertion failure");
		}
		
		session.close();
		sessionFactory.close();
	}

}
