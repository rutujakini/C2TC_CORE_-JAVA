package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImp1;

public class Client 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImp1();
		
		// Create Operation
		
		student.setStudentId(15);
	student.setName("Aarya ");
	service.addStudent(student);
		
		
	// Retrieve Operationry
//		service.findStudentById(104);
//		System.out.println("ID is: "+student.getStudentId());
//		System.out.println("Name is: "+student.getName());
		
		
		
		//Update Operation
//		student  =service.findStudentById(1);
//		student.setName("Aarya ");
//		service.updateStudent(student);
		
		
		service.findStudentById(101);
		System.out.println("ID is: "+student.getStudentId());
		System.out.println("Name is: "+student.getName());
		
		
		// Delete Operation
//		student=service.findStudentById(104);
//		service.removeStudent(student);
//		System.out.println("Row removed");
	
		System.out.println("End of program/Life cycle completed..");
		System.out.print("done");
	}}


