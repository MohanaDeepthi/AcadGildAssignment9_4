package Assignment9_4;

public class Employee implements Comparable<Employee>{
	
	String name;
	
	String designation;
	double salary;
	
	public Employee(String name,String designation,double salary){
		this.name=name;
		this.designation=designation;
		this.salary=salary;
				
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	public String toString(){
		return this.name+" "+this.designation+" "+this.salary;
	}

	
	@Override
	public int compareTo(Employee o) {
		if(this.salary>o.getSalary())
			return 1;
		else if(this.salary<o.getSalary()){
			return -1;
		}
		
		else{
			int nameDiff=this.name.compareTo(o.getName());
			if(nameDiff==0){
				return this.designation.compareTo(o.getDesignation());
			}
			else{
				return nameDiff;
			}
	}

	}	
	

}
