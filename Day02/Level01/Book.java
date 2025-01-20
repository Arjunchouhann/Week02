import java.util.Scanner;
//Creating class BookDetail
class BookDetail {
    //Creating attributes title, author, price 
    private String title ;
    private String author;
    private int price ;
    //Constructor making 
    
    public BookDetail (String bookTitle,String bookAuthor,int bookPrice){
        this.title=bookTitle; //initializing by this key word 
        this.author=bookAuthor;
        this.price=bookPrice;
    }
    //Creating displayResult method to print result
    
    public void displayResult(){
        System.out.println("Book Title : "+title +"| Book Author : "+author+"| Book Price : "+price);
    }
}
//Creating Book Main class

public class Book{
    //Main Method
    public static void main(String[] args) {
        //Scanner Object
        Scanner sc = new Scanner(System.in);
        //Creating bookTitle, bookAuthor, bookPrice variable to take user input
        System.out.println("Enter title of book : ");
        String bookTitle = sc.nextLine();
        
        System.out.println("Enter Author name of book : ");
        String bookAuthor = sc.nextLine();
        
        System.out.println("Enter Book Price : ");
        int bookPrice = sc.nextInt();
        
        //Creating object book of clas Bookdetail
        BookDetail book = new BookDetail(bookTitle,bookAuthor,bookPrice);
        
        //Calling BookDetail class by object
        book.displayResult();
    }
}