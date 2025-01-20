   public class OnlineCourseManagement{
      public static void main(String[] args) {
    
        Course course1 = new Course("Java Programming", 12, 500.0);
        Course course2 = new Course("Data Science", 16, 750.0);

        // Displaying course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // Updating the institute name
        System.out.println();
        Course.updateInstituteName("Tech Innovators Academy");

        // Displaying course details after updating the institute name
        System.out.println();
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
   }  

  class Course {
    // Instance variables
    private String courseName;
    private int duration; 
    private double fee;

    // Class variable
    private static String instituteName = "Global Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method 
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}
