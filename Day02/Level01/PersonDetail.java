import java.util.Scanner;

class Person {
    //Attributes
    private String personName;
    private int personAge;
    private String personAddress;
    //Parameterized Constructor
    public Person(String name,int age,String address){
        this.personName=name;
        this.personAge=age;
        this.personAddress=address;
    }

    //Copy Constructor
    public Person(Person previousPerson){
        this.personName = previousPerson.personName;
        this.personAge = previousPerson.personAge;
        this.personAddress = previousPerson.personAddress;
    }

    //Method to Display result
    public void displayResult(){
        System.out.println("Person Details:");
        System.out.println("Person name is : "+personName);
        System.out.println("Person age is : "+personAge);
        System.out.println("Person address is : "+personAddress);
    }
}


public class PersonDetail{
    public static void main(String[] args) {
        //Scanner Object
        Scanner sc = new Scanner(System.in);
        //Creating Variables name, age and address to take user input
        System.out.print("Enter Address : ");
        String address = sc.nextLine();
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        //Creating object person of Person class to take use of parameterized Constructor
        Person person = new Person(name,age,address);
        //Creating object person of Person class to take use of copy Constructor
        Person person2 = new Person(person);
        //Calling result method
        person.displayResult();
        person2.displayResult();
    }
}
