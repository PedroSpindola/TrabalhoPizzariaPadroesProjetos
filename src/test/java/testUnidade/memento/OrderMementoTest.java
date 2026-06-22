package testUnidade.memento;

import org.example.order.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OrderMementoTest {
    @Test
    void deveArmazenarEstados() {
        Order order = new Order();

        order.setOrderState(OrderStateApproved.getInstance());
        order.setOrderState(OrderStateProcessing.getInstance());

        assertEquals(2, order.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicialDoHistorico() {
        Order order = new Order();

        order.setOrderState(OrderStateApproved.getInstance());
        order.setOrderState(OrderStateFinalized.getInstance());

        order.restauraEstado(0);

        assertEquals(OrderStateApproved.getInstance(), order.getOrderState());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Order order = new Order();

        order.setOrderState(OrderStateApproved.getInstance());
        order.setOrderState(OrderStatePreparing.getInstance());
        order.setOrderState(OrderStateApproved.getInstance());


        order.restauraEstado(2);

        assertEquals(OrderStateApproved.getInstance(), order.getOrderState());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Order order = new Order();
            order.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
