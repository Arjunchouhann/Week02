  public class LibraryBookSystem{
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("Verity", "Collen Hover", 299.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 349.99);

        // Display details of books
        book1.displayDetails();
        book2.displayDetails();

        // Borrow a book
        book1.borrowBook();
        book1.displayDetails();

        // Attempt to borrow the same book again
        book1.borrowBook();

        // Return the book
        book1.returnBook();
        book1.displayDetails();

        // Update book details using setters
        book1.setTitle("Verity");
        book1.setAuthor("Collen Hover");
        book1.setPrice(299.99);
        book1.displayDetails();
    }
  
  } 

 class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // parameterised Constructor 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Default availability is true
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {        
            this.price = price;
    }

    // Getter and Setter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            setAvailable(false); // Update availability using setter
            System.out.println("You have successfully borrowed: " + getTitle());
            return true;
        } else {
            System.out.println("Sorry, the book '" + getTitle() + "' is currently not available.");
            return false;
        }
    }

    // Method to return a book
    public void returnBook() {
        setAvailable(true); // Update availability using setter
        System.out.println("Thank you for returning: " + getTitle());
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Not Available"));
    }
}
