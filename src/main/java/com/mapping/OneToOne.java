package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Question qu = new Question();
		qu.setQid("q2");
		qu.setQuestion("What is brain?");

		Answer ans = new Answer();
		ans.setAnsid("a2");
		ans.setAns("A part of human body");
		qu.setAid(ans);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(qu);
		session.save(ans);
		tx.commit();
		session.close();
	}

}
