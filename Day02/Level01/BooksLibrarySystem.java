
class Book {
    public String ISBN; 
    protected String title; 
    private String author;

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass
class EBook extends Book {
    private double fileSize; // Additional attribute for eBooks

    // Constructor to initialize eBook details
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call to the superclass constructor
        this.fileSize = fileSize;
    }

    public void displayDetails() {
        super.displayDetails(); // Call to the superclass method
        System.out.println("File Size: " + fileSize + " MB");
    }

    // Method to demonstrate access to public and protected members
    public void showAccessModifiers() {
        System.out.println("Accessing public member 'ISBN': " + ISBN);
        System.out.println("Accessing protected member 'title': " + title);
    }
}

public class BooksLibrarySystem{
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        System.out.println("Book Details:");
        book1.displayDetails();

        // Modify author name
        book1.setAuthor("Jane Smith");
        System.out.println("\nAfter updating author:");
        book1.displayDetails();

        // Create an EBook object
        EBook eBook1 = new EBook("978-1-23456-789-7", "Learning Python", "Alice Johnson", 2.5);
        System.out.println("\nEBook Details:");
        eBook1.displayDetails();

        // Demonstrate access to public and protected members
        eBook1.showAccessModifiers();
    }
}