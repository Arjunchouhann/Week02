import java.util.ArrayList;
import java.util.List;
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

        FullTimeEmployee employee1 = new FullTimeEmployee(123, "Arjun", 5000, 20000);
        PartTimeEmployee employee2 = new PartTimeEmployee(134, "Shristy", 2000, 9, 50);

        // add in list
        employee.add(employee1);
        employee.add(employee2);

        NewEmployee employee3 = new NewEmployee();
        employee3.assignDepartment("IT");

        for(int i=0;i<employee.size();i++){
            Employee em = employee.get(i);
            em.displayDetails();
            System.out.println(employee3.getDepartmentDetails());
            System.out.println();
        }
    }
}
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    //constructor
    public Employee(int employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    //abstract methods
    abstract double calculateSalary();

    //getter
    public int getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    //setters
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    // concrete method
    public void displayDetails(){
        System.out.println("Employee name: " + name + " | " + " Employee id: " + employeeId);
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Total salary: " + calculateSalary());
    }
}
class FullTimeEmployee extends Employee{
    private double fixedSalary;

    //constructor
    public FullTimeEmployee(int employeeId, String name,double baseSalary, double fixedSalary){
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    //getter and setter
    public double getFixedSalary(){
        return fixedSalary;
    }

    //implementing abstract method
    @Override
    public double calculateSalary(){
        return getBaseSalary() + fixedSalary;
    }
}
class PartTimeEmployee  extends Employee{
    private int workHours;
    private double wagesPerHour;
    //constructor
    public PartTimeEmployee(int employeeId, String name,double baseSalary, int workHours, double wagesPerHour){
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.wagesPerHour = wagesPerHour;
    }

    //override abstract method
    @Override
    public double calculateSalary(){
        return getBaseSalary() + (wagesPerHour * workHours);
    }
}
interface Department {
    //abstract methods
    abstract void assignDepartment(String department);
    abstract String getDepartmentDetails();
}
class NewEmployee implements Department{
    private String department;
    //override the abstract method
    @Override
    public void assignDepartment(String department){
        this.department = department;
    }
    //override the get department
    @Override
    public String getDepartmentDetails(){
        return "Department: " + department;
    }
}