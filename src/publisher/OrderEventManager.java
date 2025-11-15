package publisher;

import subscriber.OrderEventListener;

import java.util.*;

public class OrderEventManager {
    private Map<String, List<OrderEventListener>> listeners = new HashMap<>();

    public OrderEventManager(String... operations) {
        for (String op : operations) {
            listeners.put(op, new ArrayList<>());
        }
    }

    public void attach(String eventType, OrderEventListener listener) {
        listeners.get(eventType).add(listener);
    }

    public void detach(String eventType, OrderEventListener listener) {
        listeners.get(eventType).remove(listener);
    }

    public void notify(String eventType, String data) {
        List<OrderEventListener> users = listeners.get(eventType);
        for (OrderEventListener listener : users) {
            listener.update(data);
        }
    }

    public Map<String, List<OrderEventListener>> getListeners() {
        return listeners;
    }

    public void setListeners(Map<String, List<OrderEventListener>> listeners) {
        this.listeners = listeners;
    }
}