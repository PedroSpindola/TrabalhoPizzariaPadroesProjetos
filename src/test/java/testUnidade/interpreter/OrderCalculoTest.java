package testUnidade.interpreter;

import org.example.order.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderCalculoTest {
    @Test
    void deveCalcularExpressaoComFormula() {

        Order order = new Order();

        order.setPrecoPizza(50.0);
        order.setTaxaEntrega(7.0);
        order.setDescontoCupom(5.0);

        assertEquals(52.0, order.calcularTotalPedido());
    }
}
