import java.util.ArrayList;
import java.util.List;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        // using list object to show polymorphism
        List<LibraryItem> items = new ArrayList<>();


        items.add(new Book("AL101", "Harry Potter", "J.K. Rowling"));
        items.add(new Magazine("AL102", "Verity", "Colleen Hoover"));
        items.add(new DVD("AL103", "Inception", "Christopher Nolan"));


        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("---------------------------");
        }


        // Demonstrate reserving items
        for (Reservable reservableItem : items.stream().filter(item -> item instanceof Reservable).map(item -> (Reservable) item).toList()) {
            reservableItem.reserveItem();
            System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            System.out.println("---------------------------");
        }
    }
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    //constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }


    public String getItemId() {
        return itemId;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }
    // Abstract method to get loan duration
    public abstract int getLoanDuration();


    // Concrete method to get item details
    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}
interface Reservable {
    //abstract methods
    abstract void reserveItem();
    abstract boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable{
    private boolean isReserved;
    //constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    //overriding loan duration method
    @Override
    public int getLoanDuration() {
        return 14;
    }
    //overriding reserved item method
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("Book '" + getTitle() + "' is already reserved.");
        }
    }
    //overriding check if available method
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
class Magazine extends LibraryItem implements  Reservable{
    private boolean isReserved;
    //constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    //overriding loan duration method
    @Override
    public int getLoanDuration() {
        return 7;
    }
    //overriding reserved item method
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Magazine '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("Magazine '" + getTitle() + "' is already reserved.");
        }
    }
    //overriding check if available method
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
class DVD extends LibraryItem implements Reservable{
    private boolean isReserved;
    //constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }


    @Override
    public int getLoanDuration() {
        return 3;
    }
    //overriding reserved item method
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("DVD '" + getTitle() + "' is already reserved.");
        }
    }
    //overriding check if available method
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}