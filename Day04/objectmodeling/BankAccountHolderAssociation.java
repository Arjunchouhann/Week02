import java.util.ArrayList;
import java.util.concurrent.Callable;

public class BankAccountHolderAssociation {
    public static void main(String[] args) {
        Bank bank1 = new Bank("SBI");

        //object of customer
        Customer customer1 = new Customer("Arjun");
        Customer customer2 = new Customer("Abhishek");
        Customer customer3 = new Customer("shyam");

        //create account for customer
        BankAccount account1 = new BankAccount("AL202 ", 4009);
        BankAccount account2 = new BankAccount("AL204 ", 3000);
        BankAccount account3 = new BankAccount("AL203 ", 4400);

        //open account
        bank1.openAccount(customer1, account1);
        bank1.openAccount(customer2, account2);
        bank1.openAccount(customer3, account3);

        //display all customer
        bank1.displayCustomer();

        //display
        account2.depositMoney(2000);
        account3.depositMoney(300);

        System.out.println("\nUpdated balance: ");
        bank1.displayCustomer();
    }
}

class BankAccount{
   private String accountNumber;
   private double balance;

   //constructor
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //deposite
    public void depositMoney(double amount){
        balance += amount;
        System.out.println("Deposited " + amount + " successfully");
    }

    //display account
    public void displayAccount(){
        System.out.println("Account number: " + accountNumber + "Balance: " + balance);
    }
}

class Customer{
    private String name;
    private ArrayList<BankAccount> accounts;

    //constructor
    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    //add bank account
    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    //view balance
    public void viewBalance(){
        System.out.println("Customer: " + name);
        for (int i=0;i<accounts.size();i++){
            accounts.get(i).displayAccount();
        }
    }
}

class Bank{
	private String bankName;
    private ArrayList<Customer> customers;

    //constructor
    public Bank(String bankName){
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // add customer
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    //open account
    public void openAccount(Customer customer, BankAccount account){
        customer.addAccount(account);
        if(!customers.contains(customer)){
            addCustomer(customer);
        }
    }

    //display
    public void displayCustomer(){
        System.out.println("Bank: " + bankName);
        for(int i=0;i<customers.size();i++){
            customers.get(i).viewBalance();
        }
    }
}