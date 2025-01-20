import java.util.*;
class Hospital{
    private static String hospitalName="Bombay Hospital"; //Creating static hospitalName variable
    private static int totalPatient=0;
    private String name;
    private int age;
    private String ailment;
    private final String patientId;

    //constructor making to initialize variables
    public Hospital(String name, int age, String ailment, String patientId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatient++;
    }

    //method to get total number of patients
    public static int getTotalPatient() {
        return totalPatient;
    }

    //Method of printing result
    public void displayResult(){
        System.out.println("Patient Name : "+name);
        System.out.println("Patient ID : "+patientId);
        System.out.println("Patient Age : "+age);
        System.out.println("Patient Ailment : "+name);
    }
}
public class Patient {
    public static void main(String[] args) {
        //Creating objects to initiate in constructor
        Hospital patient1 = new Hospital("Vivek Patel", 12,"fever","1232412s23");
        Hospital patient2 = new Hospital("Arvind", 34,"cold","1232412swe3");
        Hospital patient3 = new Hospital("Patel", 15,"Allergy","12324342s23");
        //calling displayResult method to print details of every patients
        patient1.displayResult();
        patient2.displayResult();
        patient3.displayResult();
        //Printing total number of patients
        System.out.println("Total Patients : "+Hospital.getTotalPatient());
    }
}
