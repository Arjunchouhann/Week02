class Book {
    // Static variable shared across all books
    private static String libraryName = "Great Library";

    // Final variable for unique identifier
    private final String isbn;
    private String title;
    private String author;

    // Constructor to initialize title, author, and isbn
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn; // Final variable, cannot be changed after initialization
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) { // Check if this object is an instance of BankAccount
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("ISBN: " + isbn);
		}
		else {
			System.out.println("Invalid instance");
		}
	}
}
public class Books{
    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Display the library name
        Book.displayLibraryName();

        // Create a new book
        Book book1 = new Book("1984", "George Orwell", "1234567890");

        // Check if book1 is an instance of Book class before displaying details
        if (book1 instanceof Book) {
            book1.displayBookDetails();
        }

        // Create another book
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        // Check if book2 is an instance of Book class before displaying details
        if (book2 instanceof Book) {
            book2.displayBookDetails();
        }
    }
}
