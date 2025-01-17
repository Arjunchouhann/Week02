import java.util.Scanner;
// created the class CartitemOperation
class cartitemOperation{
    String itemName;
    int price;
    int quantity;
    String newItem ;
    // created the cartitemOpertion constructor
    public cartitemOperation(String itemName, int price, int quantity) {
        this.itemName=itemName;
        this.price= price;
        this.quantity=quantity;
    }
    // created the add method
    public void add(String item)
    {
        System.out.println("The Item add to the cart Succefully");
        newItem=item;
    }
    // created the remove method
    public void remove()
    {
        System.out.println("The Item is Removed Succesfull");
        newItem= "null";
    }
    // created the method Display Total Cost
    public void DisplayTotalCost()
    {
        System.out.println("Total Cost of the Item : "+ price*quantity);

    }
}
public class CartItem {
    public static void main(String[] args) {
        // created the Scanner for taking input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Item Name ");
        String itemName = input.next();
        System.out.println("Enter the Price of Item");
        int price = input.nextInt();
        System.out.println("Enter the Quantity of Item");
        int quantity = input.nextInt();
        // created the constructor and created its object
        cartitemOperation item = new cartitemOperation(itemName , price, quantity);
        // calling the add method
        item.add("fruit");
        // calling the remove method
        item.remove();
        // calling the DisplayTotalCost
        item.DisplayTotalCost();
    }
}