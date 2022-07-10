package com.cg.jpastart.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="emp_store")
@DiscriminatorValue(value="MGR")  
public class Manager extends Employee {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}


/*use demo;
create table emp_store(
employeeId INT NOT NULL,
 name VARCHAR(45) NOT NULL,
 salary INT NOT NULL,
 PRIMARY KEY (employeeId)
);
select * from demo.emp_store;
insert into emp_store values(2,"siya",5000);*/