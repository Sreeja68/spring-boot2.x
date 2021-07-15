package com.questions.may31;

public class Employee {
	String name;
	int age;
	int salary;
	
	public Employee() {
		super();
		
	}

	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeQuestion8 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	

}
