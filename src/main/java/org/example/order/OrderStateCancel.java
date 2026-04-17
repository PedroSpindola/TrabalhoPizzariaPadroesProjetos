package org.example.order;

public class OrderStateCancel extends OrderState {

    private static OrderStateCancel instance = new OrderStateCancel();
    private OrderStateCancel() {}
    public static OrderStateCancel getInstance() {
        return instance;
    }
}
