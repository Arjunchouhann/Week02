import java.util.ArrayList;
public class EcommercePlatform {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 15000.0);
        Product product2 = new Product("Smartphone", 7000.0);
        Product product3 = new Product("Headphones", 1000.0);

        // Create Customers
        Customers customer1 = new Customers("Arjun Chouhan");

        // Create an Order and associate products with it
        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places an order
        customer1.placeOrder(order1);

        // Display Order details
        order1.displayOrderDetails();

        // Create another order for the customer
        Order order2 = new Order(customer1);
        order2.addProduct(product2);
        order2.addProduct(product3);

        // Customer places another order
        customer1.placeOrder(order2);

        // Display the second order's details
        order2.displayOrderDetails();
    }
}
class Customers {
    private String name;
    private ArrayList<Order> orders;

    // Constructor
    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order of product that means it shows
    // aggregationg between product and order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Display Customer Orders
    public void displayCustomerOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }

    // Getter for customer name
    public String getName() {
        return name;
    }
}
class Order {
    private Customers customer;
    private ArrayList<Product> products;
    private double totalAmount;

    // Constructor
    public Order(Customers customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order placed by: " + customer.getName());
        System.out.println("Products in order:");
        for (Product product : products) {
            product.displayProductDetails();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}

class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for product name
    public String getName() {
        return name;
    }

    // Getter for product price
    public double getPrice() {
        return price;
    }

    // Display product details
    public void displayProductDetails() {
        System.out.println("Product: " + name + " | Price: $" + price);
    }
}