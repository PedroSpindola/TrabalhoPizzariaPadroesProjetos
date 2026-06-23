package testUnidade.interpreter;

import org.example.calculator.IExpressionInterpreter;
import org.example.calculator.OrderInterpreter;
import org.example.calculator.Pizzaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OrderInterpreterTest {
    @Test
    void deveCalcularExpressaoSoma() {
        IExpressionInterpreter interpretador = new OrderInterpreter("6 + 2");
        assertEquals(8.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSubtracao() {
        IExpressionInterpreter interpretador = new OrderInterpreter("6 - 2");
        assertEquals(4.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoCombinada() {
        IExpressionInterpreter interpretador = new OrderInterpreter("50.0 + 7.0 - 5.0");
        assertEquals(52.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularFormulaPizzaria() {

        double totalPedido = Pizzaria.calcularTotalPedido(50.0, 7.0, 5.0);
        assertEquals(52.0, totalPedido);
    }

    @Test
    void deveRetornarExcecaoElementoInvalido() {
        try {
            IExpressionInterpreter interpretador = new OrderInterpreter("6 * 2");
            interpretador.interpretar();
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoExpressaoInvalida() {
        try {
            IExpressionInterpreter interpretador = new OrderInterpreter("2 +");
            interpretador.interpretar();
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }
}
