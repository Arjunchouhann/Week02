//Creating parent class Employee
class Employee {

    //Attributes of super class
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //Creating method to display Result
    public void displayDetails(){
        System.out.println("name : "+name +" | Id : "+id+" | salary : "+salary);
    }
}

//Child classes Manager
class Manager extends Employee{
    //Unique Attributes
    private int teamSize;

    //Creating constructor using super to Access parent attributes and initialize team size
    public Manager(String name, String id, double salary , int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    //override method displayDetails and also use super keyword to use super class method
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : "+teamSize+"\n");
    }
}

//Child class Developer
class Developer extends Employee{
    //Unique Attributes
    private String programmingLanguage;

    //Creating constructor using super to Access parent attributes and initialize programming Language
    public Developer(String name, String id, double salary , String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    //override method displayDetails and also use super keyword to use super class method
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : "+programmingLanguage+"\n");
    }
}

//Child class Intern
class Intern extends Employee{
    //Unique Attributes
    private int experience ;

    //Creating constructor using super to Access parent attributes and initialize experience
    public Intern(String name, String id, double salary , int experience) {
        super(name, id, salary);
        this.experience = experience;
    }

    //override method displayDetails and also use super keyword to use super class method
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Experience(In number of Months) : "+experience+"\n");
    }
}
//Employee Main class or Driver class
public class EmployeeMain{
    //Main Method
    public static void main(String[] args) {
        
        //Creating objects of every class
        Manager employee1 = new Manager("Arjun Chouhan","0192ME211011",223032,15);
        Developer employee2 = new Developer("Shristy Mishra","0192Cs211106",210441,"Java FullStack");
        Intern employee3 = new Intern("Rajveer Sengar","0237JJH323",364324,12);
        
        //Calling through objets
        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();
    }
}