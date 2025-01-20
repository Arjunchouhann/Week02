import java.util.*;
class VehicleDetails{
    private static int registrationFee=0;
    private String ownerName;
    private String vehicleType;
    private String registrationNumber;

    //Constructor formation to initialize
    public VehicleDetails(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    //Method to update resitration fee
    public static int updateRegistrationFee(){
        registrationFee=500;
        return registrationFee;
    }
    //method of printing details
    public void displayResult(){
        System.out.println("vehicle owner name : "+ ownerName);
        System.out.println("Vehicle type : "+vehicleType);
        System.out.println("Registration Number : "+registrationNumber);
    }
}
public class Vehicle {
    //Main method
    public static void main(String[] args) {
        //Constructor calling by creating object
        VehicleDetails vehicle1 = new VehicleDetails("Arjun","car","1424wef234");
        VehicleDetails vehicle2 = new VehicleDetails("Prince","cycle","1424wefa3");
        VehicleDetails vehicle3 = new VehicleDetails("Raj","bike","1424wef234");
        //Method call by object
        vehicle1.displayResult();
        vehicle2.displayResult();
        vehicle3.displayResult();
        System.out.println("Registration Fee : "+VehicleDetails.updateRegistrationFee());
    }
}