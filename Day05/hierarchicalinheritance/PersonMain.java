
//parent class of hierarchical inheritance
class Person {
    private String name;
    private int age;

    //Creating Constructor to initialize attributes
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //Display Details
    public void displayRole() {
        System.out.println("Name : "+name+" | age : "+age);
    }
}

//Creating child class
class Teacher extends Person {
    //Creating Unique Attributes of this class
    private String subject;

    //Creating constructor of this class to initialize its unique attributes
    //using super method to use parent class Attributes
    public Teacher(String name, int age, String subject) {
        super(name,age);
        this.subject = subject;
    }

    //Printing Details
     @Override
    public void displayRole() {
        System.out.println("I am a Teacher");
        super.displayRole();
        System.out.println("Subject : "+subject);
    }
}


//Creating child class
class Student extends Person{
    //Creating Unique Attributes of this class
    private char grade;

    //Creating constructor of this class to initialize its unique attributes
    //using super method to use parent class Attributes
    public Student(String name, int age, char grade) {
        super(name,age);
        this.grade = grade;
    }

    //Printing Details
    @Override
    public void displayRole() {
        System.out.println("I am a Student");
        super.displayRole();
        System.out.println("Grade : "+grade);
    }
}

//Creating child class
class Staff extends Person{

    //Creating Unique Attributes of this class
    private String department;

    //Creating constructor of this class to initialize its unique attributes
    //using super method to use parent class Attributes
    public Staff(String name, int age, String department) {
        super(name,age);
        this.department = department;
    }

    //Printing Details
    @Override
    public void displayRole() {
        System.out.println("I am Staff");
        super.displayRole();
        System.out.println("Department : "+department);
    }
}

//Driver class
public class PersonMain{
    public static void main(String[] args) {

        //Creating Objects of every sub-class
        Teacher person1 = new Teacher("Abhishek Patil",50,"Mathematics");
        Student person2 =new Student("Arjun Chouhan",21,'A');
        Staff person3 = new Staff("Shristy Mishra",21,"Cleaning Department");

        //Calling through objects
        person1.displayRole();
        person2.displayRole();
        person3.displayRole();
    }
}
