package programming;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	int id;
	String name;
	double salary;
	 
	public Employee(int i,String n,double sal) {
		this.id=i;
		this.name=n;
		this.salary=sal;	
	}
	
public static void main(String[] args) {
	Employee e1=new Employee(1,"Deva",99988989.909);
	Employee e2=new Employee(2,"Salaar",19988989.909);
	Employee e3=new Employee(3,"mahi",29987989.909);
        Employee e4=new Employee(4,"raina",2954989.909);
        Employee e5=new Employee(5,"jaddu",299889.909);
          
	
	ArrayList al=new ArrayList();
	al.add(e1);  al.add(e2); al.add(e3);
         al.add(e5);
          al.add(e4);
	Collections.sort();
}

}
