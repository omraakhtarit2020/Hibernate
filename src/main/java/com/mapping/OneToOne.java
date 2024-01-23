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

//		Question qu = new Question();
//		qu.setQid("q1");
//		qu.setQuestion("What is java?");
//
//		Answer ans = new Answer();
//		ans.setAnsid("a1");
//		ans.setAns("A programming language");
//		ans.setQid(qu);
//
//		Answer ans1 = new Answer();
//		ans1.setAnsid("a2");
//		ans1.setAns("It is used to make softwares");
//		ans1.setQid(qu);
//
//		Answer ans2 = new Answer();
//		ans2.setAnsid("a3");
//		ans2.setAns("It is not pure oop language");
//		ans2.setQid(qu);

//		List<Answer> list = new ArrayList<Answer>();
//		list.add(ans);
//		list.add(ans1);
//		list.add(ans2);

//		qu.setAid(list);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		session.save(qu);
//		session.save(ans);
//		session.save(ans1);
//		session.save(ans2);

		// To fetch data:

//		Question q = (Question) session.get(Question.class, "q1");
//
//		System.out.println("Question is " + q.getQuestion());
//
//		for (Answer a : q.getAid()) {
//			System.out.println(a.getAns());
//		}
		tx.commit();
		session.close();
	}

}
