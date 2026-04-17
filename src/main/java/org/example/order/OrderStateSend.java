package org.example.order;

public class OrderStateSend extends OrderState {

    private static OrderStateSend instance= new OrderStateSend();
    private OrderStateSend() {}
    public static OrderStateSend getInstance() {
        return instance;
    }

    @Override
    public boolean cancelOrder(Order order) {
        order.setOrderState(OrderStateCancel.getInstance());
        return true;
    }

    @Override
    public boolean finalizedOrder(Order order) {
        order.setOrderState(OrderStateFinalized.getInstance());
        return true;
    }
}
