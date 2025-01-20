import java.util.*;
class StudentDetails{
    private static String universityName = "R.G.P.V.";
    private static int totalStudent=0;
    private String studentName;
    final private String rollNumber; //using final variable that can't changed once assigned
    private char grade;

    //Creating constructor to initialize

    public StudentDetails(String studentName, String rollNumber, char grade) {
        this.studentName = studentName;
        this.rollNumber = rollNumber; //using this to resolve ambiguity
        this.grade = grade;
        totalStudent++; // incresing number of students
    }
    //method displayTotalStudents to show number of students
    public static int displayTotalStudents(){
        return totalStudent;
    }
    //Displaying method
    public void displayResult(){
        if(this instanceof StudentDetails) {
            System.out.println("Student Name : " + studentName);
            System.out.println("Student roll number : " + rollNumber);
            System.out.println("Student Grade : " + grade);
        }
        else {
            System.out.println("Invalid Instance");
        }
    }
}
public class Student {
    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("Arjun Chouhan","0192ME211011",'A');
        StudentDetails student2 = new StudentDetails("Shristy Mishra","0192Al211106",'C');
        student1.displayResult();
        student2.displayResult();
        System.out.println("Total Students is "+StudentDetails.displayTotalStudents());
    }
}
