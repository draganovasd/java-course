package Employee;
	
public class Employee {
	public int workHours;
	public int salary;
	
	public Employee(){
		this.workHours=0;
		this.salary=0;
	}
	
	public Employee(int workHours, int Salary){
       this();
		
		setSalary(Salary);
		setWorkHours(workHours);
	}
	
	public void setSalary(int salary){
		this.salary=salary;
	}
	
	public int getSalary(){
		return this.salary;
	}
	
	public void setWorkHours(int workHours){
		this.workHours=workHours;
	}
	
	public int getWorkHours(){
		return this.workHours;
	}
	public void printHours(){
		System.out.println("Total working hours: "+this.workHours);
	}
	public void printSalary(){
		System.out.print("The salary is: "+this.salary);
	}
	public void print(){
		printHours();
		printSalary();
	}
public static void main(String[] args){
		
		Employee myEmployee=new Employee(23,15);
		
		myEmployee.print();
		
	}
}
