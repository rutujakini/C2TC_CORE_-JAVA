package com.cg.jpacrud.dao;
import com.cg.jpacrud.entities.Student;

public interface StudentDao {
//CRUD operation 
	
	public abstract Student getStudentById(int id); // to retrieve Data

	public abstract  void addStudent(Student student);  //persist
	public abstract  void removeStudent(Student student);
	public abstract  void updateStudent (Student student); //merge
	public abstract  void commiTransaction();
	public abstract  void beginTransaction();
	}  

//1) begin the transaction , 2) done CRUD operation and 3)commit transaction


//from here we can  remove and adding the method  

//and class StudentDaoimp1 will have actual class 



 

