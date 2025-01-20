package Practice;

import java.util.*;
public class Circle {
    //Attributes
    double radius;
    //Default Constructor
    public Circle(){
        System.out.println("Default Constructor Found");
    }
    //Parameterized constructor
    public Circle(double radiusOfCircle) {
        this.radius = radiusOfCircle;
    }

    //method areaOfCircle to calculate area of circle
    public double areaOfCircle(double radius) {
        Double area = (Math.PI) * (Math.pow(radius, 2));
        return area;
    }

    //method circumferenceOfCircle to calculate circumference
    public double circumferenceOfCircle(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    //display method to display result
    public void displayResult(double area, double circumference) {
        System.out.println("Area of circle of radius " + radius + " is " + area);
        System.out.println("Circumference of circle is " + circumference);
    }
}
class CircleDetail{
    //Main method
    public static void main(String[] args) {
        //Scanner object
        Scanner sc = new Scanner(System.in);
        //Creating variable areaOfCircle to take user input
        System.out.print("Enter radius : ");
        double radiusOfCircle = sc.nextDouble();
        //Creating object of class Circle
        Circle obj = new Circle(radiusOfCircle);
        Circle obj2 = new Circle();
        //Calling methods areaOfCircle & circumferenceOfCircle
        double area = obj.areaOfCircle(radiusOfCircle);
        double circumference = obj.circumferenceOfCircle(radiusOfCircle);
        //display result calling
        obj.displayResult(area, circumference);
    }
}
