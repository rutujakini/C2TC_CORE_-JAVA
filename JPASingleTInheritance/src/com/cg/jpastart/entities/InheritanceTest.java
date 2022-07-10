package com.cg.jpastart.entities;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();//EMPLOYEE CLASS OBJECT
		employee.setName("Minal");
		employee.setSalary(5000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();//MANAGER CLASS OBJECT
		manager.setName("Aarya");
		manager.setSalary(10000);
		//manager.setDepartmentName("HR");
		em.persist(manager);
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		//em.close();
		//factory.close();
	}
	
	
}
