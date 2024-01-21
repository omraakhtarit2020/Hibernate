package com.learning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Student st = new Student();

		st.setId(1);
		st.setName("Omra");

		Address ad = new Address();
		ad.setStreet("Canal Street");
		ad.setCity("Kolkata");
		ad.setCreationDate(new Date());
		ad.setOpen(false);
		ad.setX(23.14);

		FileInputStream fis = new FileInputStream("src/main/java/img.webp");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);

		Session ses = factory.openSession();
		ses.beginTransaction();
		ses.save(st);
		ses.save(ad);
		ses.getTransaction().commit();
		ses.close();
	}
}
