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
  Student student = entityManager.find(Student.class, id);
  return student;
}
  @Override
  public void addStudent(Student student) {
  entityManager.persist(student);
}
  @Override
  public void removeStudent(Student student) {
  entityManager.remove(student);
}
  @Override
  public void updateStudent(Student student) {
  entityManager.merge(student);
}
  @Override
  public void beginTransaction() {
  entityManager.getTransaction().begin();
}
  @Override
  public void commiTransaction() {
  entityManager.getTransaction().commit();
} }




