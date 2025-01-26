

import java.util.List;
import java.util.ArrayList;
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // creating a list for storing vehicle
        List<Vehicle> vehicles = new ArrayList<>();


        vehicles.add(new Car("AB01", 50.00, "INS12345"));
        vehicles.add(new Bike("BC01", 20.00, "INS4534"));
        vehicles.add(new Truck("CD01", 100.00, "INS543876"));


        int rentalDays = 5; // Example rental period


        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = ((Insurable) vehicle).calculateInsurance();
            String insuranceDetails = ((Insurable) vehicle).getInsuranceDetails();


            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + rentalCost);
            System.out.println("Insurance Cost: $" + insuranceCost +"\n");
            System.out.println(insuranceDetails);
        }
    }
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    //constructors


    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }


    public String getVehicleNumber() {
        return vehicleNumber;
    }


    public String getType() {
        return type;
    }


    public double getRentalRate() {
        return rentalRate;
    }


    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);
}
interface Insurable {
    //abstract method to calculate insurance
    abstract double calculateInsurance();
    //abstract method to get details
    abstract String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
    private String insuranceNumber;
    //constructors
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insuranceNumber = insurancePolicyNumber;
    }
    //overriding rental cost method
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    //overriding calculate insurance method
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // Example: 10% of rental rate
    }
    //overriding get insurance details


    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insuranceNumber;
    }
}
class Bike extends Vehicle implements Insurable{
    private String insuranceNumber;
    //constructors
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insuranceNumber = insurancePolicyNumber;
    }
    //overriding rental cost method
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    //overriding calculate insurance method
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // Example: 5% of rental rate
    }
    //overriding get insurance details


    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insuranceNumber;
    }
}
class Truck extends Vehicle implements Insurable{
    private String insuranceNumber;
    //constructors
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insuranceNumber = insurancePolicyNumber;
    }
    //overriding rental cost method


    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    //overriding calculate insurance method
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // Example: 15% of rental rate
    }
    //overriding get insurance details


    @Override
    public String getInsuranceDetails() {
        return "Insurance Number: " + insuranceNumber;
    }
}