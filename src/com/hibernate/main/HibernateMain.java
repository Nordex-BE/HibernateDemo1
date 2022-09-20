package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();


	}

}
