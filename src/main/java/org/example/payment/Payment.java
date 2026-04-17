package org.example.payment;

import org.example.checkout.Checkout;
import org.example.order.Order;

public abstract class Payment {

    private Order order;
    private Checkout checkout;

    public Checkout getCheckout() {
        return checkout;
    }

    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
