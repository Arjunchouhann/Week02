public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "Alice Smith", 1000.0);
        System.out.println("Bank Account Details:");
        account1.displayAccountDetails();

        // Modify balance
        account1.setBalance(1200.0);
        System.out.println("\nAfter updating balance:");
        account1.displayAccountDetails();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount1 = new SavingsAccount("987654321", "Bob Johnson", 2000.0, 3.5);
        System.out.println("\nSavings Account Details:");
        savingsAccount1.displayAccountDetails();

        // Demonstrate access to public and protected members
        savingsAccount1.showAccessModifiers();
    }
}

class BankAccount {
    public String accountNumber; 
    protected String accountHolder; 
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the balance
    public void setBalance(double balance) {
        if (balance >= 0) { 
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. It cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate; // Additional attribute for savings account

    // Constructor 
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance); // Call to the superclass constructor
        this.interestRate = interestRate;
    }
	
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Call to the superclass method
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Method to demonstrate access to public and protected members
    public void showAccessModifiers() {
        System.out.println("Accessing public member 'accountNumber': " + accountNumber);
        System.out.println("Accessing protected member 'accountHolder': " + accountHolder);
    }
}

