package com.cg.jpacrud.client;

import java.util.Scanner;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImp1;

public class Client {

	
	public static void main(String[] args) {
		
//for user input
		System.out.println("Enter Student ID");
		Scanner sc= new Scanner(System.in); 
		int a= sc.nextInt(); 
		   System.out.println("Enter Student Name");
		String b = sc.next();
//		
		
		
// CURD operation calling activity
		StudentService service=new StudentServiceImp1();
		
		Student student=new Student();
		
		//Create operation
		student.setStudentId(a);
		student.setName(b);
		service.addStudent(student);
//		
		//at this breakpoint,we have added one record to table
		
		//retrieve operation
//		student=service.findStudentById(a);
//		System.out.print("ID:"+student.getStudentId());
//		System.out.println("Name:"+student.getName());
		
	//update operation
		
//		student=service.findStudentById(11);
//		student.setName("Sanvi");
//	    service.updateStudent(student);
	    
	    //at this breakpoint, we have updated record added in first section
	    
//	    student=service.findStudentById(a);
//	    System.out.println("ID:"+student.getStudentId());
//	    System.out.println("Name:"+student.getName());
	    
	  //at this breakpoint, record is removed from table
	   // Delete Operation
//        student=service.findStudentById(11);
//        service.removeStudent(student);
        
	    System.out.println("End of program/Life cycle completed...");
	
	    System.out.print("done");
	}

}