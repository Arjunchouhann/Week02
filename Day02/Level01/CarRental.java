class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 0;
        this.costPerDay = 0.0;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Getter and Setter for customerName
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter and Setter for carModel
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Getter and Setter for rentalDays
    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        if (rentalDays > 0) {
            this.rentalDays = rentalDays;
        } else {
            System.out.println("Rental days must be positive.");
        }
    }

    // Getter and Setter for costPerDay
    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        if (costPerDay >= 0) {
            this.costPerDay = costPerDay;
        } else {
            System.out.println("Cost per day cannot be negative.");
        }
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Car Model: " + getCarModel());
        System.out.println("Rental Days: " + getRentalDays());
        System.out.println("Cost Per Day: $" + getCostPerDay());
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method to test the CarRental class
    public static void main(String[] args) {
        // Using the parameterized constructor
        CarRental rental1 = new CarRental("John Doe", "Toyota Camry", 5, 50.0);
        rental1.displayDetails();

        System.out.println();

        // Using the default constructor and setters
        CarRental rental2 = new CarRental();
        rental2.setCustomerName("Jane Smith");
        rental2.setCarModel("Honda Accord");
        rental2.setRentalDays(3);
        rental2.setCostPerDay(60.0);
        rental2.displayDetails();
    }
}
