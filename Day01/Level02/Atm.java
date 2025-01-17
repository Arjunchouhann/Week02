class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited INR " + amount);
        } 
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew INR " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: INR " + balance);
    }
 }
  
  public class Atm{
    // Main method
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("Sammy ", "0192368", 5000.0);

        // Display initial balance
        System.out.println("Initial Account Details:");
        account.displayBalance();

        // Deposit money
        account.deposit(45000.0);
        account.displayBalance();

        // Withdraw money
        account.withdraw(1200.0);
        account.displayBalance();
    }
  
  }