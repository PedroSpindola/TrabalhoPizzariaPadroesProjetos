package org.example.order;

public class OrderStateFinalized extends OrderState {

    private static OrderStateFinalized instance = new OrderStateFinalized();
    private OrderStateFinalized() {}
    public static OrderStateFinalized getInstance() {
        return instance;
    }
}
