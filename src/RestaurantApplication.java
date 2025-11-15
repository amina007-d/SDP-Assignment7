import concretesubscribers.CustomerListener;
import concretesubscribers.KitchenListener;
import concretesubject.Order;

public class RestaurantApplication {
    public static void main(String[] args) {
        Order order = new Order("Order #912");

        KitchenListener kitchen = new KitchenListener();
        CustomerListener customer1 = new CustomerListener("Amina");
        order.events.attach("placed", customer1);

        order.events.attach("placed", kitchen);
        order.events.attach("cooking", customer1);
        order.events.attach("ready", kitchen);
        order.events.attach("ready", customer1);
        order.events.attach("delivered", customer1);

        order.placeOrder();
        order.startCooking();
        order.readyForPickup();
        order.deliverOrder();
    }
}