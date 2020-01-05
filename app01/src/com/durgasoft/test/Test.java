
package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.pojo.Employee;

public class Test {

	public static void main(String[] args) throws Exception{
		
		Configuration config = new Configuration();
		config.configure(); // getting the data from the configuration file.
		
		SessionFactory sessionFactory = config.buildSessionFactory(); //driver management and connection management.
		
		Session session = sessionFactory.openSession(); //to perform database operation (the persistence op)
		
		Transaction tx = session.beginTransaction(); // it's like prepared statement.
		
		Employee emp = new Employee();
		emp.setEno(111);
		emp.setEname("AAA");
		emp.setEsal(5000.0);
		emp.setEaddr("Hyd");
		
		int eno=(Integer)session.save(emp);
		tx.commit();
		
		if(eno == 111) {
			System.out.println("Employee inserted successfully");
			
		}
		else {
				System.out.println("Employee insertion failed");
		}
		session.close();
		sessionFactory.close();
			
	}

}
