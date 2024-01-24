package com.fetchType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchTypeDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

//		Question q = new Question();
//		q.setQid(1);
//		q.setQues("What is Java?");
//
//		Answer ans = new Answer();
//		ans.setAid(1);
//		ans.setAnswer("A programming language");
//		ans.setQues(q);
//
//		Answer ans1 = new Answer();
//		ans1.setAid(2);
//		ans1.setAnswer("A platform dependent language");
//		ans1.setQues(q);
//
//		List<Answer> list = new ArrayList<Answer>();
//
//		q.setAns(list);

		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();

//		ses.save(q);
//		ses.save(ans);
//		ses.save(ans1);

		// Lazy loading by default -> it wont load the answer until unless getter setter
		// called
		Question q = (Question) ses.get(Question.class, 1);
		System.out.println(q.getQid());
		System.out.println(q.getQues());
//		System.out.println(q.getAns().size());
		tx.commit();
		ses.close();

	}

}
