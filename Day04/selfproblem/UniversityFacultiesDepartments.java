import java.util.ArrayList;
public class UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University university = new University("RGPV University");

        // Create Departments (Composition)
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mechanical");

        // Add Departments to the University
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Create Faculty members (Aggregation)
        Faculty faculty1 = new Faculty("prof. Amol");
        Faculty faculty2 = new Faculty("prof. Bhuvan");

        // Assign Faculty to Departments
        department1.addFaculty(faculty1);
        department2.addFaculty(faculty2);

        // Display University details
        university.displayUniversity();

        // Show that Faculty can exist independently
        System.out.println("\nIndependent Faculty:");
        System.out.println(faculty1.getName());
        System.out.println(faculty2.getName());

        // Deleting the University
       university.deleteUniversity();
       
        // After deletion, Departments no longer exist, but Faculty members still do
        System.out.println("\nAfter University Deletion:");
        System.out.println("Faculty still exist:");
        System.out.println(faculty1.getName());
        System.out.println(faculty2.getName());
    }
}

class University {
    private String universityName;
    private ArrayList<Department> departments;

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Add a Department to the University
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display University details
    public void displayUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (int i = 0; i < departments.size(); i++) {
            departments.get(i).displayDepartment();
        }
    }
    public void deleteUniversity(){
        departments.clear();
    }
}

// Department class (Part of University Composition)
class Department {
    private String departmentName;
    private ArrayList<Faculty> facultyMembers;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    // Add a Faculty member to the Department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Display Department details
    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        System.out.print("Faculty Members:");
        for (int i = 0; i < facultyMembers.size(); i++) {
            System.out.println("- " + facultyMembers.get(i).getName());
        }
    }
}

// Faculty class (Aggregated with the University)
class Faculty {
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Get Faculty name
    public String getName() {
        return name;
    }
}