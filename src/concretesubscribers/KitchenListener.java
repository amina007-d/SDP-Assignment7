package concretesubscribers;

import subscriber.OrderEventListener;

public class KitchenListener implements OrderEventListener {

    @Override
    public void update(String orderId) {
        System.out.println("Kitchen: Processing update for " + orderId);
    }
}