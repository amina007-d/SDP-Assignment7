package subscriber;

public interface OrderEventListener {
    void update(String orderId);
}