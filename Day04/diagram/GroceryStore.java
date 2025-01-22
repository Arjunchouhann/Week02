import java.util.ArrayList;
import java.util.List;
class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;
    
	//constructor
    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }

    public String toString() {
        return name + " (" + quantity + " units at $" + pricePerUnit + " per unit)";
    }
}

class Customer {
    private String name;
    private List<Product> purchasedProducts;
     
	 //constructor
    public Customer(String name) {
        this.name = name;
        this.purchasedProducts = new ArrayList<>();
    }
     //get product 
    public void purchaseProduct(Product product) {
        purchasedProducts.add(product);
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public String getName() {
        return name;
    }
}

class BillGenerator {
    public static void generateBill(Customer customer) {
        System.out.println("Generating bill for: " + customer.getName());
        List<Product> products = customer.getPurchasedProducts();
         
		 //checking if product list is already empty
        if (products.isEmpty()) {
            System.out.println("No products purchased.");
            return;
        }

        double totalAmount = 0;
        System.out.println("Products Purchased:");
        for (Product product : products) {
            System.out.println(" - " + product);
            totalAmount += product.getTotalPrice();
        }
         //display total bill
        System.out.printf("Total Bill: $%.2f%n", totalAmount);
    }
}

public class GroceryStore {
    public static void main(String[] args) {
         
		 //create object for customer
        Customer customer = new Customer("Alice");
        // add product in the bill
        customer.purchaseProduct(new Product("Apples", 3.0, 2.0)); 
        customer.purchaseProduct(new Product("Milk", 2.0, 1.0));   

        //call bill generator method
        BillGenerator.generateBill(customer);
    }
}