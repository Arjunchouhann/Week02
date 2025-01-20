import java.util.*;
class Employee {
    //static variable shared across all employees
    private static String companyName = "Capgemini";
    private static int totalEmployees = 0; //To keep Track of total number of employees
    private String name;
    //final variable to ensure it cannot be changed once assigned
    final private String id;
    private String designation;

    //constructor to initialize employees id ,name and designation
    public Employee(String employeeName,String employeeId, String employeeDesignation){
        this.name=employeeName;
        this.id=employeeId;
        this.designation=employeeDesignation;//using this to resolve ambiguity
        totalEmployees++; //incrementing numbers of employees
    }

    //static method to get the total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    //method of display result
    public void displayEmployeesDetails(){
        if (this instanceof Employee) { // Check if this object is an instance of company Employees
            System.out.println("Employee Name : " + name);
            System.out.println("Employee ID : " + id);
            System.out.println("Employee Designation : " + designation);
        }
        else {
            System.out.println("This is not a valid company employees instance.");
        }
    }
}

public class EmployeeDetails{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Arjun Chouhan","0192ME211011","Software Developer");
        Employee employee2 = new Employee("Abhishek patil","0192XS218491","Manager");
        Employee employee3 = new Employee("Vishal Bhadre","0192ME211051","IT engineer");

        employee1.displayEmployeesDetails();
        employee2.displayEmployeesDetails();
        employee3.displayEmployeesDetails();
        System.out.println("Total Number of employees is "+ Employee.getTotalEmployees());
    }
}
