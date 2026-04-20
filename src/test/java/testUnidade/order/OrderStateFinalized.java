package testUnidade.order;

import org.example.order.Order;
import org.example.order.OrderStateCancel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class OrderStateFinalized {
    private Order order;

    @BeforeEach
    public void setUp(){
        this.order = new Order();
        order.setOrderState(OrderStateCancel.getInstance());    }
    @Test
    public void deveRetornarFalsoPendent(){
        assertFalse(order.pendentOrder());
    }
    @Test
    public void deveRetornarfalseProcessing(){
        assertFalse(order.processingOrder());
    }
    @Test
    public void deveRetornarFalsaApproved(){
        assertFalse(order.approvedOrder());
    }
    @Test
    public void deveRetornarFalsoPreparing(){
        assertFalse(order.preparingOrder());
    }
    @Test
    public void deveRetornarFalsoSend(){
        assertFalse(order.sendOrder());
    }
    @Test
    public void deveRetornarFalsoFinalized(){
        assertFalse(order.finalizedOrder());
    }
    @Test
    public void deveRetornarFalsoCancel(){
        assertFalse(order.cancelOrder());
    }
}
