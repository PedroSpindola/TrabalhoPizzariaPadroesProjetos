package org.example.delivery;

import org.example.order.Order;

public class PriorityDelivery implements IDelivery {
    @Override
    public Float calcularEntrega(Order order) {
        return 15.00f;
    }
}
