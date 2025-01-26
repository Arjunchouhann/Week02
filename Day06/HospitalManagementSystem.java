
import java.util.ArrayList;
import java.util.List;

// Abstract class for patients
abstract class Patient {
    private String patientId; // Unique ID for the patient
    private String name; // Patient's name
    private int age; // Patient's age

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate the bill
    public abstract double calculateBill();

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

// Interface for medical records
interface MedicalRecord {
    void addRecord(String record); // Method to add a medical record
    List<String> viewRecords(); // Method to view all medical records
}

// InPatient class extending Patient
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate; // Daily rate for in-patients
    private int daysAdmitted; // Number of days admitted
    private List<String> medicalRecords; // List to store medical records

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted; // Calculate bill based on daily rate and days admitted
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record); // Add a medical record
    }

    @Override
    public List<String> viewRecords() {
        return medicalRecords; // Return the list of medical records
    }
}

// OutPatient class extending Patient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee; // Consultation fee for out-patients
    private List<String> medicalRecords; // List to store medical records

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee; // Bill is just the consultation fee
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record); // Add a medical record
    }

    @Override
    public List<String> viewRecords() {
        return medicalRecords; // Return the list of medical records
    }
}

// Main application
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating instances of patients
        Patient inPatient = new InPatient("IP001", "Alice", 30, 200.0, 5);
        Patient outPatient = new OutPatient("OP001", "Bob", 40, 150.0);

        // Adding medical records
        ((InPatient) inPatient).addRecord("Admitted for surgery.");
        ((OutPatient) outPatient).addRecord("Consulted for fever.");

        // Displaying patient details and billing information
        displayPatientInfo(inPatient);
        displayPatientInfo(outPatient);
    }

    // Method to display patient information
    public static void displayPatientInfo(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Bill Amount: $" + patient.calculateBill());

        // Displaying medical records
        if (patient instanceof MedicalRecord) {
            List<String> records = ((MedicalRecord) patient).viewRecords();
            System.out.println("Medical Records: " + records);
        }
        System.out.println(); // For better readability
    }
}