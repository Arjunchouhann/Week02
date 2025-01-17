public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the movie name
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked for '" + this.movieName + "' at seat " + this.seatNumber + " for $" + String.format("%.2f", this.price) + ".");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (this.seatNumber != null) {
            System.out.println("Movie: " + this.movieName);
            System.out.println("Seat Number: " + this.seatNumber);
            System.out.println("Price: Rs." + String.format("%.2f", this.price));
        } else {
            System.out.println("No ticket booked yet.");
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create a MovieTicket instance
        MovieTicket ticket = new MovieTicket("Dealpool and Wolverine");

        // Book a ticket
        ticket.bookTicket("A12", 120);

        // Display ticket details
        ticket.displayTicketDetails();
    }
}