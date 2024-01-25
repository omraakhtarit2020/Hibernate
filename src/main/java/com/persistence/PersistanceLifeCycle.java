package com.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersistanceLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		StudentDemo sd = new StudentDemo();
		// when you set data of the obj they are in transient state
		sd.setId(1);
		sd.setName("Omra");
		sd.setName("Kolkata");

		Session s = factory.openSession();
		// when you save them they are in persistent state (obj in db and session)
		Transaction tx = s.beginTransaction();
		s.save(sd);
		sd.setName("Umrah");// when you update it will be reflected in db
		tx.commit();

		// Detached state
		s.close();
		// this will get printed if you fetch it but will not get save in sesson
		sd.setName("Anam");

		System.out.println(sd.getName());

	}

}
