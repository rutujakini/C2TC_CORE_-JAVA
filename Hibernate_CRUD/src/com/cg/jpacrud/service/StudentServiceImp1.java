package com.cg.jpacrud.service;

import com.cg.jpacrud.dao.StudentDao;

import com.cg.jpacrud.dao.StudentDaoImp1;
import com.cg.jpacrud.entities.Student;

public class StudentServiceImp1 implements StudentService {
	
private com.cg.jpacrud.dao.StudentDao dao;

public StudentServiceImp1() 
 
{
	
dao = new StudentDaoImp1();

}

@Override
public void addStudent(Student student) {
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commiTransaction();
	
}

@Override
public void removeStudent(Student student) {
	dao.beginTransaction();
	dao.removeStudent(student);
	dao.commiTransaction();
	
}

@Override
public void updateStudent(Student student) {
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commiTransaction();
	
}

@Override
public Student findStudentById(int id) {
	// no need of transaction,as its an read operation
	Student student=dao.getStudentById(id);
	return student;
}
}