import java.util.ArrayList;
public class SchoolStudentCourses {
    public static void main(String[] args) {
		//Creating objects 
        School school1 = new School("TIT");

        Students student1 = new Students("Arjun Chouhan");
        Students student2 = new Students("Abhishek patil");
        Students student3 = new Students("Rajveer");

        Courses course1 = new Courses("Java Fullstack");
        Courses course2 = new Courses("Python Fullstack");

        // add student to school shows aggregation
        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);

        // display schol and students
        school1.displaySchool();

        // students enroll in courses to show association
        student1.addToCourse(course2);
        student2.addToCourse(course1);
        student3.addToCourse(course2);

        student1.displayStudents();
        student2.displayStudents();
        student3.displayStudents();

        // add student to courses shows many to many relations of association
        course1.addStudents(student1);
        course2.addStudents(student2);

        //display
        course1.displayCourses();
        course2.displayCourses();

    }
}

class School{
    private String schoolName;
    private ArrayList<Students> student;

    //constructor
    public School(String schoolName){
        this.schoolName = schoolName;
        this.student = new ArrayList<>();
    }

    //enroll students in schroon
    public void addStudent(Students stu){
        student.add(stu);
    }

    //display sschool
    public  void displaySchool(){
        System.out.println("School: " + schoolName);
        System.out.println("Students: ");
        for (int i=0;i<student.size();i++) {
            System.out.println("- " + student.get(i).studentName);
        }
    }
}
class Students{
     String studentName;
    private ArrayList<Courses> course;

    //constructor
    public Students(String studentName){
        this.studentName = studentName;
        this.course = new ArrayList<>();
    }


    //add student to courses
    public void addToCourse(Courses cou){
        course.add(cou);
       // course.addLast(this);
    }

    public String getName() {
        return studentName;
    }
    //display students course
    public void displayStudents(){
        System.out.println("Student Name: " + studentName);
        System.out.print("Enrolled courses: ");
        for (int i=0;i<course.size();i++){
            System.out.println("- " + course.get(i).getCourseName());
        }
    }
}
class Courses{
    private String courseName;
    private ArrayList<Students> enrollStudents;

    //constructor
    public Courses(String courseName){
        this.courseName = courseName;
        this.enrollStudents = new ArrayList<>();
    }

    // enroll  student to courses
    public void addStudents(Students st){
        enrollStudents.add(st);
    }

    //display students in courses
    public void displayCourses(){
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled students: ");
        for (int i=0;i<enrollStudents.size();i++){
            System.out.println("- " + enrollStudents.get(i).getName());
        }
    }
    public String getCourseName() {
        return courseName;
    }
}