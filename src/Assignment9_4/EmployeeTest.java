package Assignment9_4;

import java.util.*;

public class EmployeeTest {
	
	public static void main(String args[]){
		TreeSet<Employee> empList=new TreeSet<Employee>();
		
		empList.add(new Employee("emp1","Manager",10000));
		empList.add(new Employee("emp2","Associate Manager",5000));
		empList.add(new Employee("emp2","Associate Manager",7000));
		empList.add(new Employee("emp1","Manager",20000));
		System.out.println(empList);
		
	}

}
