import java.util.Scanner;
//Creating class Item to print item inventory
public class Item{
	private int itemCode;
	private String itemName;
	private int price;
	//setter
	public void setItemCode(int itemCode){
		this.itemCode = itemCode;
	}
	//getter
	public int getItemcode(){
		return itemCode;
	}
	//setter
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	//getter
	public String getItemName(){
		return itemName;
	}
	//setter
	public void setPrice(int price){
		this.price = price;
	}
	//getter
	public int getPrice(){
		return price;
	}
	//display result
	public void displayResult(int quantity){
		System.out.println("Item Code : " +itemCode + " Item name "+ itemName +" Item price " + price + " Total price is : " + price*quantity);
	}
	//Main method
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);  //Scanner object
		System.out.println("Enter ItemCode : ");
		int itemCode = sc.nextInt(); // itemCode variable to take user input
		sc.nextLine();
		System.out.println("Enter ItemName : ");
		String itemName = sc.nextLine(); // itemName variable to take user input
		System.out.println("Enter ItemPrice : ");
		int price = sc.nextInt(); // price variable to take user input
		Item item = new Item();
		System.out.println("Enter quantity : ");
		int quantity = sc.nextInt(); // price variable to take user input
		item.setItemCode(itemCode); // calling getItemcode
		item.setItemName(itemName); // calling getItemName
		item.setPrice(price); // calling getPrice
		item.displayResult(quantity); // calling displayResult
	}
		
	}