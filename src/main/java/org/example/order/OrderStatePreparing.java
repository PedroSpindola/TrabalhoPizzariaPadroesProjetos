package org.example.order;

public class OrderStatePreparing extends OrderState {

    private static OrderStatePreparing instance = new OrderStatePreparing();
    private OrderStatePreparing() {}
    public static OrderStatePreparing getInstance() {
        return instance;
    }

    @Override
    public boolean cancelOrder(Order order) {
        order.setOrderState(OrderStateCancel.getInstance());
        return true;
    }

    @Override
    public boolean sendOrder(Order order) {
        order.setOrderState(OrderStateSend.getInstance());
        return true;
    }
}
