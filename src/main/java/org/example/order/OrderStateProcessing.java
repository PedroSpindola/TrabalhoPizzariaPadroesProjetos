package org.example.order;

public class OrderStateProcessing extends OrderState {

    private static OrderStateProcessing instance = new OrderStateProcessing();
    private OrderStateProcessing() {}
    public static OrderStateProcessing getInstance() {
        return instance;
    }

    @Override
    public boolean cancelOrder(Order order) {
        order.setOrderState(OrderStateCancel.getInstance());
        return true;
    }
    @Override
    public boolean approvedOrder(Order order) {
        order.setOrderState(OrderStateApproved.getInstance());
        return true;
    }
}
