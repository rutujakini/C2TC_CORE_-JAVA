package com.cg.jpacrud.entities;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="student")
public class Student  implements Serializable{
	
private static final long serialVersionUID=1L;
@Id
private int studentId;

private String name;

//generate getter and setter

public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

	
}
