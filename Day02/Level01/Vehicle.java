  public class Vehicle{
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0; // Fixed registration fee for all vehicles

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
	
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice Smith", "Sedan");
        Vehicle vehicle2 = new Vehicle("Bob Johnson", "SUV");

        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        
        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(150.0);
        System.out.println("\nUpdated Registration Fee:");

        System.out.println("Vehicle 1 Details After Fee Update:");
        vehicle1.displayVehicleDetails();
        
        System.out.println("\nVehicle 2 Details After Fee Update:");
        vehicle2.displayVehicleDetails();
    }
}