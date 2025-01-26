
import java.util.ArrayList;
import java.util.List;
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();


        // Add food items to the order
        VegItem item1 = new VegItem("Paneer tikka", 10.00, 2);
        NonVegItem item2 = new NonVegItem("Chicken tikka", 8.00, 1, 1.50);


        // Apply discount
        item1.applyDiscount(10);
        item2.applyDiscount(5);


        order.add(item1);
        order.add(item2);


        // Processing the order
        double totalOrderPrice = 0;
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println(((Discountable) item).getDiscountDetails()); // Cast to Discountable
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price: $" + totalPrice);
            totalOrderPrice += totalPrice;
        }


        System.out.println("Total Order Price: $" + totalOrderPrice);
    }
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    //constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


    public String getItemName() {
        return itemName;
    }


    public double getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }


    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();
    // Concrete method to get item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity;
    }
}
interface Discountable {
    //abstract methods
    abstract void applyDiscount(double discountPercentage);
    abstract String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable{
    private double discountPercentage;


    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercentage = 0; // No discount by default
    }
    //overriding calculate total price method
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 - discountPercentage / 100);
    }
    // overriding apply discount
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    //overriding get discount method
    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "%"; // This method is implemented
    }
}
class NonVegItem extends FoodItem implements Discountable{
    private double gstBill;
    private double discountPercentage;
    //constructor
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.gstBill = additionalCharge;
        this.discountPercentage = 0; // No discount by default
    }
    //overriding calculate total price method
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + gstBill) * getQuantity() * (1 - discountPercentage / 100);
    }
    // overriding apply discount
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    //overriding get discount method
    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "%"; // This method is implemented
    }
}
