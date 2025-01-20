import java.util.*;
class ProductDetails {
    //Static variable who shared by every product
    private static double discount = 0;
    private String productName;
    private double price;
    private double quantity;
    final String productId; //using final which doesn't change once assigned
    //constructor to initialize discount , product name ,price ,id , quantity
    public ProductDetails(String productName , String productId , double price ,double quantity){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        discount+=10; //when 1 product is added discount increases 0 to 10%
    }
    //Creating updateDiscount Method
    public static double updateDiscount(){
        return discount;
    }
    public void displayDetails(){
		if(this instanceof ProductDetails){
			System.out.println("Product Id : "+productId);
			System.out.println("Product Name : "+productName);
			System.out.println("Product price (Single) : "+price);
			System.out.println("Product Quantity : "+quantity);
		}
		else{
			System.out.println("Invalid Instance");
		}
	}

}
public class Product{
    public static void main(String[] args) {
		//Calling constructor to initialize variables
        ProductDetails product1 = new ProductDetails("Apple","21093193",20,5);
        ProductDetails product2 = new ProductDetails("Mango","21043193",12,2);
        ProductDetails product3 = new ProductDetails("juice","234093193",20,1);
        ProductDetails product4 = new ProductDetails("Cookies","25493193",10,3);
        //Calling methods to print 
		product1.displayDetails();
        product2.displayDetails();
        product3.displayDetails();
        product4.displayDetails();
        System.out.println("Total Discount is : " +ProductDetails.updateDiscount());
    }

}