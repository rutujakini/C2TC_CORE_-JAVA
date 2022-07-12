package com.cg.jpacrud.dao;
 import javax.persistence.EntityManager;

import com.cg.jpacrud.entities.Student;
  
public class StudentDaoImp1 implements StudentDao {
  
	private EntityManager entityManager;
  public StudentDaoImp1() {
  entityManager = JPAUtil.getEntitymanager();
}
@Override
public Student getStudentById(int id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void addStudent(Student student) {
	// TODO Auto-generated method stub
	
}
@Override
public void removeStudent(Student student) {
	// TODO Auto-generated method stub
	
}
@Override
public void updateStudent(Student student) {
	// TODO Auto-generated method stub
	
}
@Override
public void commiTransaction() {
	// TODO Auto-generated method stub
	
}
@Override
public void beginTransaction() {
	// TODO Auto-generated method stub
	
}
  
}


