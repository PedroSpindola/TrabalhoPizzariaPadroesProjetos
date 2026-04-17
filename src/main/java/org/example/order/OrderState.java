package org.example.order;

public abstract class OrderState {

    public boolean approvedOrder(Order order) {
        return false;
    }
    public boolean cancelOrder(Order order) {
        return false;
    }
    public boolean finalizedOrder(Order order) {
        return false;
    }
    public boolean finishOrder(Order order) {
        return false;
    }
    public boolean pendentOrder(Order order) {
        return false;
    }
    public boolean preparingOrder(Order order) {
        return false;
    }
    public boolean processingOrder(Order order) {
        return false;
    }
    public boolean sendOrder(Order order) {
        return false;
    }
}
