package concretesubject;

import publisher.OrderEventManager;

public class Order {
    public OrderEventManager events;
    private String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
        this.events = new OrderEventManager("placed", "cooking", "ready", "delivered");
    }

    public void placeOrder() {
        System.out.println("\nOrder " + orderId + " placed.");
        events.notify("placed", orderId);
    }

    public void startCooking() {
        System.out.println("Order " + orderId + " is now cooking...");
        events.notify("cooking", orderId);
    }

    public void readyForPickup() {
        System.out.println("Order " + orderId + " is ready for pickup!");
        events.notify("ready", orderId);
    }

    public void deliverOrder() {
        System.out.println("Order " + orderId + " has been delivered.");
        events.notify("delivered", orderId);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}