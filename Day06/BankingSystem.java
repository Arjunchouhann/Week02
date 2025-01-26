import java.util.ArrayList;
import java.util.List;
public class BankingSystem {
    public static void main(String[] args) {
        // using list object to show polymorphism
        List<BankAccount> accounts = new ArrayList<>();


        accounts.add(new SavingsAccount("SA001", "Shristy", 1500.00, 0.05));
        accounts.add(new CurrentAccount("AB001", "Arjun", 500.00, 200.00));


        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Current Balance: $" + account.getBalance());


            // Calculate and display interest
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: $" + interest);
        }
        // Demonstrate loan application and eligibility
        for (Loanable loanableAccount : accounts.stream().filter(account -> account instanceof Loanable).map(account -> (Loanable) account).toList()) {
            double loanAmount = 1000.00;
            loanableAccount.applyForLoan(loanAmount);
            boolean eligible = loanableAccount.calculateLoanEligibility(loanAmount);
            System.out.println("Loan Eligibility for $" + loanAmount + ": " + (eligible ? "Eligible" : "Not Eligible"));
        }
    }
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    //constructor
    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public String getHolderName() {
        return holderName;
    }


    public double getBalance() {
        return balance;
    }
    // concrete method to deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    // concrete method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }


    // Abstract method to calculate interest
    public abstract double calculateInterest();
}
interface Loanable {
    //abstract methods
    abstract void applyForLoan(double amount);
    abstract boolean calculateLoanEligibility(double amount);
}
class SavingsAccount extends BankAccount implements Loanable{
    private double interestRate;
    //constructor
    public SavingsAccount(String accountNumber, String holderName, double initialBalance, double interestRate) {
        super(accountNumber, holderName, initialBalance);
        this.interestRate = interestRate;
    }
    // overriding calculate interest method
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
    // overriding apply loan method
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for $" + amount + " has been submitted for Savings Account.");
    }
    // overriding eligible for loan loan method
    @Override
    public boolean calculateLoanEligibility(double amount) {
        // Example eligibility criteria: must have at least $1000 in balance
        return getBalance() >= 1000;
    }
}
class CurrentAccount extends BankAccount implements Loanable{
    private double overdraftLimit;
    //constructor
    public CurrentAccount(String accountNumber, String holderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, holderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    // overriding calculate interest method
    @Override
    public double calculateInterest() {
        // Current accounts typically do not earn interest
        return 0;
    }
    // overriding apply loan method
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for $" + amount + " has been submitted for Current Account.");
    }
    // overriding eligible for loan loan method
    @Override
    public boolean calculateLoanEligibility(double amount) {
        // Example eligibility criteria: must have a positive balance or within overdraft limit
        return getBalance() + overdraftLimit >= amount;
    }
}