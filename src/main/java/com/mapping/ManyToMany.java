package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Omra Akhtar");

		Project proj = new Project();
		proj.setPid(1);
		proj.setPname("library management system");

		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setName("Zara Akhtar");

		Project proj1 = new Project();
		proj1.setPid(2);
		proj1.setPname("Hospital management system");

		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(emp);
		list1.add(emp1);

		List<Project> list2 = new ArrayList<Project>();
		list2.add(proj);
		list2.add(proj1);

		emp.setProjects(list2);
		proj1.setEmps(list1);

		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();

		ses.save(emp);
		ses.save(emp1);
		ses.save(proj);
		ses.save(proj1);

		tx.commit();

		ses.close();

	}

}
