package concretesubscribers;

import subscriber.OrderEventListener;

public class CustomerListener implements OrderEventListener {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerListener(String name) {
        this.name = name;
    }

    @Override
    public void update(String orderId) {
        System.out.println(name + ": Received update for " + orderId);
    }
}
