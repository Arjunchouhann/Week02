class Person {
    protected String name; // Name of the person
    protected String id;   // ID of the person

    // Constructor to initialize name and id attributes
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Method to display the basic details (name and id) of the person
    public void displayDetail() {
        System.out.println("Name : "+name+" | ID : "+id);
    }
}

// Interface to define the worker behavior (can perform duties)
interface Worker {
    // Abstract method to perform duties, to be implemented by worker classes
    abstract void performDuties();
}

// Chef class extends Person and implements Worker interface
class Chef extends Person implements Worker {

    private String famousDish; // Dish for which the chef is famous

    // Constructor to initialize name, id, and famous dish
    public Chef(String name, String id, String famousDish) {
        super(name, id); // Call the parent constructor to initialize name and id
        this.famousDish = famousDish; // Initialize the famousDish attribute
    }

    // Implementing performDuties() method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name+" is Cooking"); // Chef's specific duty is cooking
    }

    // Overriding displayDetail() method to add chef-specific details
    @Override
    public void displayDetail() {
        super.displayDetail(); // Call parent method to display basic details (name & id)
        System.out.println("Role : Chef"); // Display the role of the person (Chef)
        System.out.println("Famous Dish : "+famousDish); // Display the famous dish of the chef
    }
}

// Waiter class extends Person and implements Worker interface
class Waiter extends Person implements Worker {
    private String experience; // Experience of the waiter

    // Constructor to initialize name, id, and experience
    public Waiter(String name, String id, String experience) {
        super(name, id); // Call the parent constructor to initialize name and id
        this.experience = experience; // Initialize the experience attribute
    }

    // Overriding displayDetail() method to add waiter-specific details
    @Override
    public void displayDetail() {
        super.displayDetail(); // Call parent method to display basic details (name & id)
        System.out.println("Role : Waiter"); // Display the role of the person (Waiter)
        System.out.println("Experience : "+experience); // Display the experience of the waiter
    }

    // Implementing performDuties() method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name +" is Taking Orders"); // Waiter's specific duty is taking orders
    }
}

// Main class to demonstrate functionality of Chef and Waiter classes
public class PersonMain {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter classes
        Chef person1 = new Chef("Arjun Chouhan", "326491g8324", "Maggi");
        Waiter person2 = new Waiter("Shristy Mishra", "uyqg4r23", "0");

        // Call methods on the Chef instance
        person1.performDuties(); // Chef performs cooking duties
        person1.displayDetail(); // Display details of the Chef

        // Call methods on the Waiter instance
        person2.performDuties(); // Waiter performs taking orders duties
        person2.displayDetail(); // Display details of the Waiter
    }
}
