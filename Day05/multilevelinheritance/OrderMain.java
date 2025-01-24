
//Parent class Order
class Order {
    //Attributes of class Order
    private String orderId;
    private String orderDate;

    //Constructor making
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    //Creating method to Print result
    public void getOrderStatus(){
        System.out.println("Order Id : "+orderId+" | Order Date : "+orderDate);
    }
}
//child class Shipped Order
class ShippedOrder extends Order {
    private String trackingNumber;

    //Creating construtor using super method to use parent attributes and its unique attributes too
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    //Creating method displayresult and use super keyword to use parent method
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Order Placed");
        System.out.println("Tracking Number : "+trackingNumber);

    }
}

class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    //Creating constructor to initialize Deliverydate and using super method to use parent class attribute
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    //Creating method to print order details

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Order Shipped");
        System.out.println("Delivery Date : "+ deliveryDate);
    }
}

//Driver method
public class OrderMain{
    public static void main(String[] args) {

        //Creating object of class
       DeliveredOrder order = new DeliveredOrder("01074981018A2","01/01/2025","90124838","12/01/2025");

        //Calling method by object
        order.getOrderStatus();
    }
}
