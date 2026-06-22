package testUnidade.iterator;

import org.example.menu.Filter;
import org.example.menu.Menu;
import org.example.menu.cardapio.PizzaMenu;
import org.example.pizza.Pizza;
import org.example.pizza.type.FamilyPizza;
import org.example.pizza.type.MiniPizza;
import org.example.pizza.type.NormalPizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTest {
    @Test
    void deveContarPizzasAtivasNoMenu() {
        Pizza pizza1 = new FamilyPizza("Calabresa Família", 40.0f, null);
        pizza1.setAtivo(true);

        Pizza pizza2 = new MiniPizza("Muçarela Brotinho", 20.0f, null);
        pizza2.setAtivo(true);

        Pizza pizza3 = new NormalPizza("Frango com Catupiry", 35.0f, null);
        pizza3.setAtivo(false);

        Pizza pizza4 = new FamilyPizza("Chocolate Família", 45.0f, null);
        pizza4.setAtivo(true);

        Menu menu = new PizzaMenu("Cardápio Principal", "001", "Geral", pizza1, pizza2, pizza3, pizza4);

        assertEquals(3, Filter.contarPizzasAtivasNoMenu(menu));
    }

    @Test
    void deveContarTotalPizzasNoMenu() {

        Pizza pizza1 = new FamilyPizza("Calabresa Família", 40.0f, null);
        pizza1.setAtivo(true);

        Pizza pizza2 = new MiniPizza("Muçarela Brotinho", 20.0f, null);
        pizza2.setAtivo(true);

        Pizza pizza3 = new NormalPizza("Frango com Catupiry", 35.0f, null);
        pizza3.setAtivo(false);

        Pizza pizza4 = new FamilyPizza("Chocolate Família", 45.0f, null);
        pizza4.setAtivo(true);

        Menu menu = new PizzaMenu("Cardápio Principal", "001", "Geral", pizza1, pizza2, pizza3, pizza4);
        assertEquals(4, Filter.contarTotalPizzasNoMenu(menu));
    }
}
