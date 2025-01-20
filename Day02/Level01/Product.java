 public class Product{
    private String productName;
    private double price;
    private static int totalProducts = 0;

    // parameterised Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: INR " + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        // Creating product instances
        Product product1 = new Product("Laptop", 51200.99);
        Product product2 = new Product("Smartphone", 3699.49);
        Product product3 = new Product("Headphones", 1149.99);

        // Displaying details of each product
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        product2.displayProductDetails();
        System.out.println();

        System.out.println("Product 3 Details:");
        product3.displayProductDetails();
        System.out.println();

        // Displaying total number of products
        Product.displayTotalProducts();
    }
}
