import java.util.ArrayList;
class Library {
    private String name;
    private ArrayList<Book> books; //Creating arraylist to store books

    //Constructor creating to initialize

    public Library(String name) {
        this.name = name;
        //When object is created arraylist books is also created to store
        this.books = new ArrayList<>();
    }
	
	//Creating method addBook to add books in arraylist
    public void addBook(Book book){
        books.add(book);
    }

    //Creating method Display Library Details
    public void displayLibraryDetails(){
        System.out.println("\nLibrary Name : " + name); //Printing Library Name
        for(Book book : books) {
            System.out.println("Book title : " + book.getTitle());
            System.out.println("Book Author : " + book.getAuthor());
        }
    }
}

//Class Book
class Book{
	//Attributes
    private String title;
    private String author;

    //Constructor to initialize
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
	//Getter to get title
	public String getTitle() {
        return title;
    }
	//Getter to getAuthor
    public String getAuthor() {
        return author;
    }
	
	//printing book details
    public void displayBook(){
        System.out.println("Book Title : "+getTitle());
        System.out.println("Book Author : "+author);
    }
}

//Driver Class
public class LibrarySystemMain {
    public static void main(String[]args){
        //Creating two object showing two different libraries
        Library library1 = new Library("World Library");
        Library library2 = new Library("Indian Library");
		
		//Creating objects of Book class for different books
        Book book1 = new Book("Mahabharat","Ved Vyas");
        Book book2 = new Book("Ramayana","Valmiki");
        Book book3 = new Book("Life is pie","Yann Martel");
        Book book4 = new Book("To Kill A Mocking Bird","Harper lee");

        //Adding different Books in particular Libraries
        library2.addBook(book1);
        library2.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);

        System.out.println("\nLibrary class");
        //Displaying Books details in library class
        library1.displayLibraryDetails();
        library2.displayLibraryDetails();

        System.out.println("\nBook class\n");
        //Displaying books details in books class
         book3.displayBook();
         book4.displayBook();

    }
}