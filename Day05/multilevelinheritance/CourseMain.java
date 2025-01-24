
//Parent class Course
class Course {

    //Attributes of class Course
    private String courseName;
    private int duration;

    //Constructor making
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    //Creating method to Print result
    public void displayDetails(){
        System.out.println("Course Name : "+courseName+" | Course Duration : "+duration+ " Years");
    }
}
//child class Online Course
class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    //Creating construtor using super method to use parent attributes and its unique attributes too
    public OnlineCourse(String courseName, int duration ,String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    //Creating method to display result and use super keyword to use parent method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform Name : "+platform + " | Lectures is Recorded ? " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    //Creating constructor to initialize fee and discount and using super method to use parent class attribute
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration, platform, isRecorded);
    }

    //Creating method to print order details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee : "+ fee + " | Discount : "+discount );
    }
}

//Driver method
public class CourseMain{
    public static void main(String[] args) {

        //Creating object of class
        PaidOnlineCourse course = new PaidOnlineCourse("Java FullStack",2,"Physics Wallah",true);

        //Calling method by object
        course.displayDetails();
    }
}
