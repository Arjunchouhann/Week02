//parent class of hierarchical inheritance
class BankAccount {
    private int accountNumber;
    private double balance;

    //Creating Constructor to initialize attributes
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    //Display Details
    public void displayDetails(){
        System.out.println("Account Number : "+accountNumber+" | Balance : "+balance);
    }
}

//Creating child class
class SavingAccount extends BankAccount{
    //Creating Unique Attributes of this class
    private double interestRate;
    
    //Creating constructor of this class to initialize its unique attributes
    //using super method to use parent class Attributes
    public SavingAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    //Printing Details 

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest rate : "+interestRate);
    }
}


//Creating child class
class Checkingaccount extends BankAccount{
    //Creating Unique Attributes of this class
    private double withdrawLimit;

    //Creating constructor of this class to initialize its unique attributes
    //using super method to use parent class Attributes
    public Checkingaccount(int accountNumber, double balance, double withdrawLimit) {
        super(accountNumber, balance);
        this.withdrawLimit = withdrawLimit;
    }

    //Printing Details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("WithDraw Limit : "+withdrawLimit);
    }
}

//Creating child class
class FixedDepositAccount extends BankAccount{
    
    //Creating Unique Attributes of this class
    private int years;

    //Creating constructor of this class to initialize its unique attributes
    //using super method to use parent class Attributes
    public FixedDepositAccount(int accountNumber, double balance,int years) {
        super(accountNumber, balance);
        this.years = years;
    }

    //Printing Details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Years to Mature : "+years);
    }
}

//Driver class
public class BankAccountMain{
    public static void main(String[] args) {

        //Creating Objects of every sub-class 
        SavingAccount account1 = new SavingAccount(41631078, 202147.00, 20.00);
        Checkingaccount account2 = new Checkingaccount(76326204, 32324.34, 50000);
        FixedDepositAccount account3 = new FixedDepositAccount(3863650, 3264634.33, 20);

        //Calling through objects
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
    }
}