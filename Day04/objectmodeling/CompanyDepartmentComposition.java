import java.util.ArrayList;
class Employee{
    private String name;
	private String id;
	  
	//constructor 
	public Employee(String name, String id){
		this.name = name;
		this.id = id;
	}
	  
	//method to display emploee detail
	public void displayEmployee(){
	    System.out.println("Employee name: " + name + "\nEmployee id: " + id);
	}
	  
}
class Company{
    private String companyName;
	private ArrayList<Department> departments;
	  
	//constructor
	public Company(String companyName){
	    this.companyName = companyName;
		this. departments = new ArrayList<>();
	}
	  
	//add departments to companyName
	public void addDepartment(Department department){
	    departments.add(department);
	}
	  
	//display company departments
	public void displayCompany(){
	    System.out.println("Company:" + companyName);
		for(int i=0;i<departments.size();i++){
		  departments.get(i).displayDepartment();
		}
	}
}

class Department{
    private String departmentName;
	private ArrayList<Employee> employees;
	  
	//constructor
	public Department(String departmentName){
	    this.departmentName = departmentName;
		this.employees = new ArrayList<>();
	}
	  
    // add employees to departments
	public void addEmployee(Employee em){
	    employees.add(em);
	}
	  
	//display employees in department
	public void displayDepartment(){
	    System.out.println("Department:" + departmentName);
		for(int i=0;i<employees.size();i++){
		   employees.get(i).displayEmployee();
		}
	}
}
   
public class CompanyDepartmentComposition{
    public static void main(String[]args){
	   
		//creating object of company
		Company company1 = new Company("MNC");
	   
		//create department object
		Department department1 = new Department("IT Department");
		Department department2 = new Department("HR department");
		Department department3 = new Department("MR department");
	   
		//create object of employees
		Employee employee1 = new Employee("Arjun Chouhan", "Al201");
		Employee employee2 = new Employee("Abhishek", "AL204");
		Employee employee3 = new Employee("Shristy Mishra", "AL302");
	   
		//add employe to department
	    department1.addEmployee(employee1);
		department2.addEmployee(employee2);
		department3.addEmployee(employee3);
		
		// add department to company
		company1.addDepartment(department1);
		company1.addDepartment(department2);
		company1.addDepartment(department3);
	   
		company1.displayCompany();
	   
		// set company to null it will show composition
		company1 = null;
		System.out.println("Company is null so all department and empolyees are now not reachable(Shows composition)");
	   
	}
}