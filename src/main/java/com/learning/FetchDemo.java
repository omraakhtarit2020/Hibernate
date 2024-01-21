package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String args[]) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// get fetch method:
		Student st = (Student) session.get(Student.class, 1);
		Student st1 = (Student) session.get(Student.class, 2);// null because we dont have any object with id 2
		System.out.println(st1);

		// load fetch method:
		Address ad = (Address) session.load(Address.class, 0);
		Address ad1 = (Address) session.load(Address.class, 1);// this throws an exception of object not found
		System.out.println(ad.getCity());// until unless you use the method it will return proxy, as you are using the
											// method so it will initialize it and hit the db.
	}

}
