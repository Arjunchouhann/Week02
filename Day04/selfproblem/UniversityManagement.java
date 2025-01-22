import java.util.ArrayList;

public class UniversityManagement{
    public static void main(String[] args) {
        // Create professors
        Professor prof1 = new Professor("prof. Abhishek");
        Professor prof2 = new Professor("prof. Arjun");

        // Create courses
        Course course1 = new Course("Artificial Intelligence");
        Course course2 = new Course("Machine Learning");

        // Assign professors to courses
        course1.assignProfessor(prof1);
        course2.assignProfessor(prof2);

        // Create students
        Student student1 = new Student("Vivek patel");
        Student student2 = new Student("Shristy");
        Student student3 = new Student("Mukesh patel");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student3.enrollCourse(course1);
        student3.enrollCourse(course2);

        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Enroll a student 
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("No professor assigned.");
        }
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enroll in a course
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this); // Associate the course with the student
    }

    public String getName() {
        return name;
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName()); // Use getter for course name here
        }
    }
}