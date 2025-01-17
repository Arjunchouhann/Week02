import java.util.*;
public class Employee{
	String employeeName;
	int employeeId;
	double employeeSalary;
	
	//Constructor
	Employee(String name,int id,double salary) {
		this.employeeName = name ;
		this.employeeId = id;
		this.employeeSalary = salary;
	}
	
	//method to display Employee Details
	void displayDetails(){
		System.out.println("Name : " + employeeName + " Id : "+ employeeId +" Salary : "+ employeeSalary);
	}
	
	//main method 
	public static void main(String[]args){
		//Scanner object
		Scanner sc = new Scanner (System.in);
		//Creating variable name , id , salary to take user input 
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Salary : ");
		Double salary = sc.nextDouble();
		//Creating object employee of Employee class  
		Employee employee = new Employee(name,id,salary);
		//calling displayDetails
		employee.displayDetails(); 
	}
}
	 