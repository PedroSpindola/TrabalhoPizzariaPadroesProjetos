package org.example.order;

public class OrderStatePendent extends OrderState {

    private static OrderStatePendent instance = new OrderStatePendent();
    private OrderStatePendent() {}
    public static OrderStatePendent getInstance() {
        return instance;
    }

    @Override
    public boolean cancelOrder(Order order) {
        order.setOrderState(OrderStateCancel.getInstance());
        return true;
    }
    public boolean processingOrder(Order order) {
        order.setOrderState(OrderStateProcessing.getInstance());
        return true;
    }
}
