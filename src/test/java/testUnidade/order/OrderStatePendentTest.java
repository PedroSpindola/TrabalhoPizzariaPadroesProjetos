package testUnidade.order;

import org.junit.jupiter.api.BeforeEach;
import org.example.order.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderStatePendentTest {

    private Order order;

    @BeforeEach
    public void setUp(){
        this.order = new Order();
    }
    @Test
    public void deveRetornarFalsoPendent(){
        assertFalse(order.pendentOrder());
    }
    @Test
    public void deveRetornarTrueProcessing(){
        assertTrue(order.processingOrder());
        assertEquals(order.getOrderState(), OrderStateProcessing.getInstance());
    }
    @Test
    public void deveRetornarFalsoApproved(){
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
    public void deveRetornarTrueCancel(){
        assertTrue(order.cancelOrder());
        assertEquals(order.getOrderState(), OrderStateCancel.getInstance());
    }

}
