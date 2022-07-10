package com.cg.japstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr")
public class Manager extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}

/*
create database demo_join;
use demo_join;
create table emp_store(
 employeeId INT NOT NULL,
 name VARCHAR(45) NOT NULL,
 salary INT NOT NULL,
 PRIMARY KEY (employeeId)
);
create table mgr (
departmentName varchar(50) not null,
 employeeId INT NOT NULL ,
 foreign key ( employeeId ) references emp_store( employeeId )
 
);
select * from emp_store;
select * from mgr;
select * from hibernate_sequence;
*/