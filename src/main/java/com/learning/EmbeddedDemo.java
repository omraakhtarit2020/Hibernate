package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Student st = new Student();
		st.setId(1);
		st.setName("Omra");

		Certificate ct = new Certificate();
		ct.setCourse("Hibernate");
		ct.setDuration("1 month");

		st.setCerti(ct);

		Student st1 = new Student();
		st1.setId(2);
		st1.setName("Anam");

		Certificate ct1 = new Certificate();
		ct1.setCourse("Hibernate");
		ct1.setDuration("1 month");

		st1.setCerti(ct1);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(st1);
		tx.commit();
		session.close();
		factory.close();
	}

}
