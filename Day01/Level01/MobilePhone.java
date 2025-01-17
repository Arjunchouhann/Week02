public class MobilePhone{
    public static void main(String[] args) {
        // Create objects of MobilePhone class
        MobileDetails mobile1 = new MobileDetails("Iphone", "Iphone 16 pro max", 3500.00);
        MobileDetails mobile2 = new MobileDetails("Samsung", "Galaxy S23 Ultra", 3000.80);

        // Display details of each phone
        System.out.println("Mobile 1:");
        mobile1.displayDetails();

        System.out.println("\nMobile 2:");
        mobile2.displayDetails();
    }
}

 
 class MobileDetails {
    private String brand;
    private String model;
    private double price;

    // Constructor 
    public MobileDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display the details of the phone
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
 }