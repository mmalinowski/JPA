package org.malinowski;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp", catalog="HR")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "emp_name", nullable = false, unique=true, length=64, updatable=false)
	private String name;
	
	@Column(name = "emp_salary", precision=100, scale=2)
	private double salary;
	
	@Basic(fetch=FetchType.LAZY)
	private String comment;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
