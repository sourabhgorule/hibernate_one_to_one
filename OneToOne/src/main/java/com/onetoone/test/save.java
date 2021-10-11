package com.onetoone.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetoone.beans.Employees;
import com.onetoone.beans.Laptop;

public class save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop laptop=new Laptop(1, "Dell", "inspiron");
		Employees emp=new Employees(198, "Manoj Ilake", laptop);
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(laptop);
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();
		
		
		
	}

}
