package testUnidade.order;

import org.example.order.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderStateApproved{

    private Order order;

    @BeforeEach
    public void setUp(){
        this.order = new Order();
        order.setOrderState(org.example.order.OrderStateApproved.getInstance());    }
    @Test
    public void deveRetornarFalsoPendent(){
        assertFalse(order.pendentOrder());
    }
    @Test
    public void deveRetornarfalseProcessing(){
        assertFalse(order.processingOrder());
    }
    @Test
    public void deveRetornarFalseApproved(){
        assertFalse(order.approvedOrder());

    }
    @Test
    public void deveRetornarTruePreparing(){
        assertTrue(order.preparingOrder());
        assertEquals(order.getOrderState(), OrderStatePreparing.getInstance());
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
    public void deveRetornarTrueCancel(){
        assertTrue(order.cancelOrder());
        assertEquals(order.getOrderState(), OrderStateCancel.getInstance());
    }
}
