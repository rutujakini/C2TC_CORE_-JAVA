package com.cg.japstart.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
	EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em= factory.createEntityManager();
	em.getTransaction().begin();
	
	//create one employee
	Employee employee=new Employee();
	employee.setName("Sanvi");
	employee.setSalary(2010);
	em.persist(employee);
	
	Manager manager = new Manager();
	manager.setName("Niraj");
	manager.setSalary(4004);
	manager.setDepartmentName("Sales");
	em.persist(manager);
	em.getTransaction().commit();
	
	
	em.close();
	factory.close();
	System.out.println("Added one employee and manager to database");
	System.out.println("Done");
	}}