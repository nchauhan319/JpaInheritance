package com.cg.jpa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class ClientInheritance {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empentity");
		EntityManager em = emf.createEntityManager();
		Manager mgr = new Manager("Nikhil Chauhan", 7702929722L,"HR");
		
		Employee emp = new Employee("Pawan",9011223344L);
		
		em.getTransaction().begin();
		em.persist(emp);
		em.persist(mgr);
		em.getTransaction().commit();
		System.out.println("Entities saved");
		Manager mgr1 = em.find(Manager.class, 2);
		System.out.println(mgr1);
		em.close();

	}

}

