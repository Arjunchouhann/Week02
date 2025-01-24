//Parent class Device
class Device{
    //Attributes of class Device
    private String deviceId;
    private String status;

    //Constructor making
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    //Creating method to Print result
    public void displayStatus(){
        System.out.println("Device Id : "+deviceId+" | Device Status : "+status);
    }
}
//child class Thermostat
class Thermostat extends Device {
    private String temperatureSetting ;

    //Creating construtor using super method to use parent attributes and its unique attributes too
    public Thermostat(String deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    //Creating method displayresult and use super keyword to use parent method
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting : "+temperatureSetting);
    }
}

//Driver class
public class DeviceMain{
    public static void main(String[] args) {

        //Creating object of class Thermostat
        Thermostat thermostat = new Thermostat("ETC961","-2.6","68");

        //Calling method by object
        thermostat.displayStatus();
    }
}
