  public class HotelBookingSystem {
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking room1 = new HotelBooking();
        System.out.println("Room 1:");
        room1.display();

        // Using parameterized constructor
        HotelBooking room2 = new HotelBooking("Amar Singh", "Ac", 3);
        System.out.println("\nRoom 2:");
        room2.display();

        // Using copy constructor
        HotelBooking room3 = new HotelBooking(room2);
        System.out.println("\nRoom 3 (copy of Room 2):");
        room3.display();

        // Using setters to modify room1 details
        room1.setGuestName("Ravi Kumar");
        room1.setRoomType("Suite");
        room1.setNights(3);
        System.out.println("\nRoom 1 (after modification):");
        room1.display();
    }
}

class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        guestName = "Rajesh Malhotra";
        roomType = "Delux";
        nights = 2;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking original) {
        this.guestName = original.guestName;
        this.roomType = original.roomType;
        this.nights = original.nights;
    }

    // Getter 
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    // Setter
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display room details
    public void display() {
        System.out.println("Guest name is: " + guestName);
        System.out.println("Room type: " + roomType);
        System.out.println("Night stay: " + nights);
    }
}
