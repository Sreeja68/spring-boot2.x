package com.questions.may31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList <Employee> alist = new ArrayList<>();
		
		Employee e1 = new Employee("Sapana", 25, 40000);
		Employee e2 = new Employee("Biplov", 40, 110000);
		Employee e3 = new Employee("Hema", 22, 20000);
		Employee e4 = new Employee("Ganesh", 33, 80000);
		
		alist.add(e1);
		alist.add(e2);
		alist.add(e3);
		alist.add(e4);
		
		for(Employee emp : alist) {
			System.out.println(emp);
		}
		System.out.println("=======================================================");
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i));
			
		}
		System.out.println("=======================================================");
		Iterator<Employee> it = alist.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp);
		}
		
		
		

	}

}
