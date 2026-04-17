package org.example.order;

public class OrderStateApproved extends OrderState {

    private static OrderStateApproved instance = new OrderStateApproved();
    private OrderStateApproved() {}
    public static OrderStateApproved getInstance() {
        return  instance;
    }

    @Override
    public boolean cancelOrder(Order order) {
        order.setOrderState(OrderStateCancel.getInstance());
        return true;
    }

    @Override
    public boolean preparingOrder(Order order) {
        order.setOrderState(OrderStatePreparing.getInstance());
        return true;
    }
}
