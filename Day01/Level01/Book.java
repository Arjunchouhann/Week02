import java.util.*;
//Creating class Book 
public class Book {
	private String title;
    private String author;
    private double price;
	//getter
    public String getTitle() {
        return title;
    }
	//setter
    public void setTitle(String title) {
        this.title = title;
    }
	//getter
    public String getAuthor() {
        return author;
    }
	//setter
    public void setAuthor(String author) {
        this.author = author;
    }
	//getter
    public double getPrice() {
        return price;
    }
	//setter
    public void setPrice(double price) {
        this.price = price;
    }
	//display result
    public void display(){
        System.out.println("Title "+ getTitle());
        System.out.println("Author "+ getAuthor());
        System.out.println("Price "+ getPrice());
    }


	
	public static void main(String[] args) {
		//Scanner object
		Scanner sc = new Scanner(System.in);
		//Creating object
        Book b = new Book();
		//Creating variable title and price to take user input
        System.out.println("Enter title :");
        String title = sc.nextLine();
		 System.out.println("Enter author :");
        String author = sc.nextLine();
		 System.out.println("Enter price : ");
        double price = sc.nextDouble();
		//Calling
        b.setTitle(title);
        b.setAuthor(author);
        b.setPrice(price);
        b.display();
    }
}