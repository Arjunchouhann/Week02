import java.util.Scanner;
  public class StudentReport{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input item details
        System.out.println("Enter number of students: ");
		int number = input.nextInt();
		input.nextLine();
		 
		 for(int i=1;i<= number;i++){
		   System.out.println("\nEnter details of students " + i + ": ");
		   System.out.println("Enter name: ");
		   String name = input.nextLine();
		   System.out.println("Enter rollnumber: ");
		   int rollNumber = input.nextInt();
		   System.out.println("Enter marks: ");
		   double marks = input.nextDouble();
		   input.nextLine();
		   
		   // Create object of class
         Student student = new Student(name, rollNumber, marks);
		 
         // display result 
		 student.displayResult();
		 }
    }
	
	
  }
  
  class Student{
	
	   String name;
	   int rollNumber;
	   double marks;
	   
	   // constructor
	   public Student(String name, int rollNumber, double marks){
		 this.name = name;
		 this.rollNumber = rollNumber;
		 this.marks = marks;
	   }
	//
	  // method to calculate grade
	  public String gradeCalculator(){
	    if(marks >= 90){
		  return "A";
		} else if(marks >= 75){
		  return "B";
		} else if(marks >= 60){
		  return "C";
		} else if(marks >= 50){
		  return "D";
		} else {
		  return "F";
		}
	  }	
	  
	  // method to display the grades
	  public void displayResult(){
	    System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + gradeCalculator());
	  }
	}