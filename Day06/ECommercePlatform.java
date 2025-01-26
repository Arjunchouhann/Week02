
import java.util.ArrayList;
import java.util.List;
public class ECommercePlatform {
    public static void main(String[] args) {
        // using list object to show polymorphism
        List<Product> product1 = new ArrayList<>();

        // add all the products in the product 1 list
        product1.add(new Electronics(101, "Washing machine", 30000, 0.10, 0.15));
        product1.add(new Clothing(102, "Skirt", 899, 0.07, 0.05));
        product1.add(new Groceries(103, "Milk", 100, 0.00, 0.05));

        // using for loop to iterate through product
        for(Product p1 : product1){
            double discount = p1.calculateDiscount();
            double tax = ((Taxable) p1).calculateTax();
            double finalPrice = (p1.getPrice() + tax - discount);

            System.out.println("Product: " + p1.getName());
            System.out.println("Price: $" + p1.getPrice());
            System.out.println("Discount: $" + discount);
            System.out.println(((Taxable) p1).getTaxDetails());
            System.out.println("Tax: $" + tax);
            System.out.println("Final Price: $" + finalPrice+"\n");
        }
    }
}
abstract class Product {
    private int productId;
    private String name;
    private double price;
    //constructor
    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //setter method
    public int getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    //abstract method
    abstract double calculateDiscount();

}
interface Taxable {
    // methpd for calculating tax
    abstract double calculateTax();
    //method to get details
    abstract String getTaxDetails();
}
class Electronics extends Product implements Taxable{
    private double discount;
    private double taxRate;
    //onstructor
    public Electronics(int productId, String name, double price, double discount, double taxRate){
        super(productId, name, price);
        this.discount = discount;
        this.taxRate = taxRate;
    }

    //override calculate discount method
    @Override
    public double calculateDiscount(){
        return getPrice() * discount;
    }
    // override calculate tax method
    @Override
    public double calculateTax(){
        return getPrice() * taxRate;
    }
    //override get tax details method
    @Override
    public String getTaxDetails(){
        return "Tax rate is:" + taxRate * 100 + " %";
    }

}
class Clothing extends Product implements Taxable{
    private double discount;
    private double taxRate;
    //constructor
    public Clothing(int productId, String name, double price, double discount, double taxRate){
        super(productId, name, price);
        this.discount = discount;
        this.taxRate = taxRate;
    }
    //override calculate discount details

    @Override
    public double calculateDiscount() {
        return getPrice() * discount;
    }
    //override calculate tax method

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
    //override get tax details method

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate * 100 + "%";
    }
}
class Groceries extends Product implements Taxable{
    private double discount;
    private double taxRate;
    //constructor
    public Groceries(int productId, String name, double price, double discount, double taxRate){
        super(productId, name, price);
        this.discount = discount;
        this.taxRate = taxRate;
    }
    //override calculate discount details

    @Override
    public double calculateDiscount() {
        return getPrice() * discount;
    }
    //override calculate tax method

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
    //override get tax details method

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate * 100 + "%";
    }
}