public class EmployeeRecords{
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(101, "IT", 50000);
        System.out.println("Employee ID: " + employee.employeeID);
        employee.setSalary(55000);
        System.out.println("Updated Salary: " + employee.getSalary());

        // Creating a Manager object
        Manager manager = new Manager(102, "HR", 75000);
        manager.displayManagerDetails();
    }
}

class Employee {
    // Attributes
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to get salary
    public double getSalary() {
        return this.salary;
    }
}

// Manager subclass
class Manager extends Employee {

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}