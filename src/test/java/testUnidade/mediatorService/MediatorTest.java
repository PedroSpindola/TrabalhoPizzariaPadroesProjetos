package testUnidade.mediatorService;

import org.example.order.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediatorTest {
    @Test
    void deveNotificarAlteracaoOrder() {
        Order order = new Order();
        String estadoEsperado = order.getOrderState().toString();

        String resultadoEsperado = "respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O sistema de notificação agradece a avaliação:Estatos alterado para" + estadoEsperado;

        assertEquals(resultadoEsperado, order.notifierAlteracao());
    }

    @Test
    void deveLoggarAlteracaoOrder() {
        Order order = new Order();
        String estadoEsperado = order.getOrderState().toString();

        String resultadoEsperado = "respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O sistema de notificação agradece a avaliação:Estado alterado para" + estadoEsperado;

        assertEquals(resultadoEsperado, order.loggerAlteracao());
    }
}
