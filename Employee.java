package org.jsp.collections.revision;

import java.util.ArrayList;

public class Employee {
	int id;
	String name;
	double salary;

	public Employee(int i, String n, double sal) {
		this.id = i;
		this.name = n;
		this.salary = sal;
	}
	@Override
	public String toString()

	{
		return id+"-"+name+"- $"+salary;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Deva", 999889.909);
		Employee e2 = new Employee(2, "Salaar", 199989.909);
		Employee e3 = new Employee(3, "mahi", 299879.909);
		Employee e4 = new Employee(4, "raina", 29989.909);
		Employee e5 = new Employee(5, "jaddu", 29889.909);

		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e5);
		al.add(e4);
		System.out.println(al);
	}

}
