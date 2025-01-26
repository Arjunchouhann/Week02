

// Abstract class for vehicles
// Abstract class for vehicles
abstract class Vehicle implements GPS {
    private String vehicleId; // Unique ID
    private String driverName; // Driver's name
    double ratePerKm; // Rate per kilometer
    private String currentLocation; // Current location

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation; // Return current location
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation; // Update location
    }
}

// GPS interface for location tracking
interface GPS {
    String getCurrentLocation(); // Get current location
    void updateLocation(String newLocation); // Update location
}

// Car class extending Vehicle
class Car extends Vehicle {
    public Car(String vehicleId, String driverName) {
        super(vehicleId, driverName, 10.0); // $10 per Km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * super.ratePerKm; // Calculate fare
    }
}

// Bike class extending Vehicle
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName) {
        super(vehicleId, driverName, 5.0); // $5 per Km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * super.ratePerKm; // Calculate fare
    }
}

// Auto class extending Vehicle
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName) {
        super(vehicleId, driverName, 7.0); // $7 per Km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * super.ratePerKm; // Calculate fare
    }
}

// Main application
public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle car = new Car("C123", "John Doe");
        Vehicle bike = new Bike("B456", "Jane Smith");
        Vehicle auto = new Auto("A789", "Mike Johnson");

        double distance = 15.0; // Distance in Km

        // Calculate and print fares
        System.out.println("Car Fare: " + calculateFare(car, distance));
        System.out.println("Bike Fare: " + calculateFare(bike, distance));
        System.out.println("Auto Fare: " + calculateFare(auto, distance));
    }

    // Method to calculate fare for any vehicle
    public static double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.calculateFare(distance); // Polymorphism in action
    }
}