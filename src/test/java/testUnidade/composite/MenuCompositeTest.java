package testUnidade.composite;

import org.example.menu.Menu;
import org.example.menu.cardapio.Chapter;
import org.example.menu.cardapio.PizzaMenu;
import org.example.menu.cardapio.Topic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MenuCompositeTest {
    @Test
    void deveRetornarCardapioMenu() {

        Chapter secao1 = new Chapter("Entradas");

        Chapter secao2 = new Chapter("Pratos Principais");
        Topic topico21 = new Topic("Pizza de Pepperoni");
        secao2.addConteudo(topico21);

        Chapter secao3 = new Chapter("Bebidas");
        Topic topico31 = new Topic("Suco Natural");
        Topic topico32 = new Topic("Refrigerante Artesanal");
        secao3.addConteudo(topico31);
        secao3.addConteudo(topico32);

        Chapter cardapioCompleto = new Chapter("Cardápio Geral");
        cardapioCompleto.addConteudo(secao1);
        cardapioCompleto.addConteudo(secao2);
        cardapioCompleto.addConteudo(secao3);

        Menu menu = new PizzaMenu("Menu Especial", "M01", "Pizzaria");
        menu.setCardapio(cardapioCompleto);

        assertEquals("Tópico: Cardápio Geral\n" +
                "Tópico: Entradas\n" +
                "Tópico: Pratos Principais\n" +
                "Tópico: Pizza de Pepperoni\n" +
                "Tópico: Bebidas\n" +
                "Tópico: Suco Natural\n" +
                "Tópico: Refrigerante Artesanal\n", menu.getCardapio());
    }

    @Test
    void deveRetornarExcecaoMenuSemCardapio() {
        try {
            Menu menu = new PizzaMenu("Menu Especial", "M01", "Pizzaria");
            menu.getCardapio();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Cardapio indisponivel", e.getMessage());
        }
    }
}
