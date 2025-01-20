class Student {
    public int rollNumber; 
    protected String name;  
    private double CGPA; 

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. It must be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

 // create a Subclass
class PostgraduateStudent extends Student {
    private String thesisTitle; 

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA); // Call to the superclass constructor
        this.thesisTitle = thesisTitle;
    }

    // Method to display postgraduate student details
    public void displayDetails() {
        super.displayDetails(); // Call to the superclass method
        System.out.println("Thesis Title: " + thesisTitle);
    }

    // Method to demonstrate access to protected member
    public void showProtectedMember() {
        System.out.println("Accessing protected member 'name' from subclass: " + name);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student(101, "Alice", 3.5);
        student1.displayDetails();

        // Modify CGPA
        student1.setCGPA(3.8);
        System.out.println("\nAfter updating CGPA:");
        student1.displayDetails();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 3.9, "AI in Healthcare");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayDetails();

        // Demonstrate access to protected member
        pgStudent.showProtectedMember();
    }
}