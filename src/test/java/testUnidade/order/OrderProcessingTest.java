package testUnidade.order;

import org.example.order.Order;
import org.example.order.OrderStateApproved;
import org.example.order.OrderStateCancel;
import org.example.order.OrderStateProcessing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessingTest {
    private Order order;

    @BeforeEach
    public void setUp(){
        this.order = new Order();
        order.setOrderState(OrderStateProcessing.getInstance());    }
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
        assertTrue(order.approvedOrder());
        assertEquals(order.getOrderState(), OrderStateApproved.getInstance());
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
