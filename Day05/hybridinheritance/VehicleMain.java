public class VehicleMain {
    public static void main(String[] args) {
        PetrolVehicle vehicle1 = new PetrolVehicle(120, "Hero honda", "empty");
        System.out.println("Petrol vehicle details: ");
        vehicle1.displayInfo();
        vehicle1.refuel();


        ElectricVehicle vehicle2 = new ElectricVehicle(60, "Rikshaw", 90);
        System.out.println("Electric vehicle details: ");
        vehicle2.displayInfo();
        vehicle2.charge();

    }
}
//superclass
class Vehicle{
    int maxSpeed;
    String model;
    //constructor
    public Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // method to display details
    public void displayInfo(){
        System.out.println("Maximum speed is: " + maxSpeed + " km/hr");
        System.out.println("model: " + model);
    }
}

// interface
interface Refuelable{
    //abstract method
    abstract void refuel();
}
//subclass
class ElectricVehicle extends Vehicle{
    int charge;
    //constructor
    public ElectricVehicle(int maxSpeed, String model, int charge){
        super(maxSpeed, model);
        this.charge = charge;
    }
    //override method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("charge is: " + charge + " %");
    }

    public void charge(){
        System.out.println("Electric vehicle is charging");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    String tankStatus;
    //constructor
    public PetrolVehicle(int maxSpeed, String model, String tankStatus){
        super(maxSpeed, model);
        this.tankStatus = tankStatus;
    }


    // override display method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("tank status: " + tankStatus);
    }
    //implementation for abstract method
    @Override
    public void refuel(){
        System.out.println("Refilling the tank");
    }

}