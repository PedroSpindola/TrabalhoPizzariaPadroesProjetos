package org.example.payment;

import org.example.checkout.Checkout;
import org.example.order.Order;

public abstract class Payment {

    protected IProcessor processor;

    private Order order;
    private Checkout checkout;
    public abstract String pay();

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

    public void setProcessor(IProcessor processor) {
        this.processor = processor;
    }

    public IProcessor getProcessor() {
        return this.processor;
    }
}
