package testUnidade.order;

import org.example.order.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderStateSendTest {
    private Order order;

    @BeforeEach
    public void setUp(){
        this.order = new Order();
        order.setOrderState(OrderStateSend.getInstance());    }
    @Test
    public void deveRetornarFalsoPendent(){
        assertFalse(order.pendentOrder());
    }
    @Test
    public void deveRetornarfalseProcessing(){
        assertFalse(order.processingOrder());
    }
    @Test
    public void deveRetornarTrueApproved(){
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
    public void deveRetornarTrueCancel(){
        assertTrue(order.cancelOrder());
        assertEquals(order.getOrderState(), OrderStateCancel.getInstance());
    }
}
