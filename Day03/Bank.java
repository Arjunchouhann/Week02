import java.util.*;
class BankAccount{
    // Static variable shared across all accounts
    private static String bankName = "Bank Of India";
    private static int totalAccounts = 0; // To keep track of the total number of accounts

    // Final variable to ensure it cannot be changed once assigned
    private final String accountNumber;
    private String accountHolderName;

    // Constructor to initialize account holder name and account number
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // Using 'this' to resolve ambiguity
        totalAccounts++; // Increment the total accounts count
    }

    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) { // Check if this object is an instance of BankAccount
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("This is not a valid BankAccount instance.");
        }
    }
}
public class Bank{
    // Main method to test the BankAccount class
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Arjun Chouhan", "ACC123456");
        BankAccount account2 = new BankAccount("Abhishek Patil", "ACC654321");

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}