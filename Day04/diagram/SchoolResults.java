import java.util.ArrayList;
import java.util.List;

class Subject {
    private String name;
    private int marks;
     
	 //constructors
    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return name + " (Marks: " + marks + ")";
    }
}

// Class representing a Student
class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}

// Class responsible for calculating grades
class GradeCalculator {
    public static void calculateGrade(Student student) {
        System.out.println("Calculating grade for: " + student.getName());
        List<Subject> subjects = student.getSubjects();

        if (subjects.isEmpty()) {
            System.out.println("No subjects found.");
            return;
        }

        double totalMarks = 0;
        System.out.println("Subjects and Marks:");
        for (Subject subject : subjects) {
            System.out.println(" - " + subject);
            totalMarks += subject.getMarks();
        }

        double average = totalMarks / subjects.size();
        System.out.printf("Total Marks: %.2f%n", totalMarks);
        System.out.printf("Average Marks: %.2f%n", average);

        String grade = determineGrade(average);
        System.out.println("Grade: " + grade);
    }

    private static String determineGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 75) return "B";
        if (average >= 50) return "C";
        return "D";
    }
}

// Main class 
public class SchoolResults {
    public static void main(String[] args) {
        // Create subjects independently
        Subject math = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Create a student and associate subjects with them
        Student student = new Student("John");
		// add subject to students shows aggregateion
        student.addSubject(math);  
        student.addSubject(science);

        // Calculate and display the grade
        GradeCalculator.calculateGrade(student);
    }
}