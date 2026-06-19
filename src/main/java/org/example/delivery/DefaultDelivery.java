package org.example.delivery;

import org.example.order.Order;

public class DefaultDelivery implements IDelivery{
    public Float calcularEntrega(Order order) {
        return 5.00f;
    }
}
