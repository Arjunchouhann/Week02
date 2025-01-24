//Creating parent class Vehicle
class Vehicle {
    //Creating Attributes
    private double maxSpeed;
    private String fuelType;

    //Creating constructor


    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //Creating method displayInfo to display details
    public void displayInfo(){
        System.out.println("fuel Type : "+fuelType +" | Maximum speed : "+ maxSpeed);
    }
}

class Car extends Vehicle{
    private int seatCapacity;
    //Creating construtor using super method to use parent attributes and seat Capacity
    public Car(double maxSpeed , String fuelType ,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }

    //Creating method displayresult and use super keyword to use parent method

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity+"\n");
    }
}

//child method truck
class Truck extends Vehicle{

    //unique attributes
    private int loadCapacity;

    //Constructor to initialize load capacity and using super method to use parent attributes
    public Truck(double maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    //Method to Print Result and using super keyword to Use parent class method

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity : "+loadCapacity+"\n");
    }
}
//Child class MotarCycle
class MotarCycle extends Vehicle{
    private int cc;
    //Creating construtor using super method to use parent attributes and cc
    public MotarCycle(double maxSpeed , String fuelType ,int cc){
        super(maxSpeed,fuelType);
        this.cc=cc;
    }

    //Creating method displayresult and use super keyword to use parent method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("MotarCycle's CC : "+cc+"\n");
    }
}

public class VehicleMain{
    public static void main(String[] args) {
        //Creating vehicle array to store different objects
        Vehicle [] vehicle = new Vehicle[3];
        
        //Creating objects of every class
        Car bmw = new Car(300,"Premium Gasoline",2);
        Truck ashokleyland = new Truck(90,"Petrol",500);
        MotarCycle harley = new MotarCycle(180,"Petrol",1200);
        
        //Giving values to elements of vehicle array
        vehicle[0]=bmw;
        vehicle[1]=ashokleyland;
        vehicle[2]=harley;

        //Using objects to call methods
        for (int i=0; i<3 ; i++){
            vehicle[i].displayInfo();
        }
    }
}