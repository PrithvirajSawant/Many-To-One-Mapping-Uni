package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Accounts;
import com.jsp.entities.Person;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("Raj");
		p.setAge(22);
		p.setLoc("Bangalore");
		
		Accounts aa = new Accounts();
		aa.setBankName("SBI");
		aa.setNum(1234780080);
		aa.setPerson(p);
		
		Accounts aa2 = new Accounts();
		aa2.setBankName("Axis");
		aa2.setNum(223468929);
		aa2.setPerson(p);
		
		Accounts aa3 = new Accounts();
		aa3.setBankName("HDFC");
		aa3.setNum(323452627);
		aa3.setPerson(p);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(p);
		em.persist(aa);
		em.persist(aa2);
		em.persist(aa3);
		et.commit();

	}

}
