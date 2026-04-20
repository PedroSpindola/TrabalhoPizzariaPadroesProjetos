package testUnidade.order;

import org.example.order.*;
import org.example.order.Order;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class OrderStatePreparingTest {

    private Order order;

    @BeforeEach
    public void setUp(){
        this.order = new Order();
        order.setOrderState(OrderStatePreparing.getInstance());    }
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
    public void deveRetornarFalsoPreparing(){
        assertFalse(order.preparingOrder());
    }
    @Test
    public void deveRetornarTrueSend(){
        assertTrue(order.sendOrder());
        assertEquals(order.getOrderState(),OrderStateSend.getInstance());
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
