package testUnidade.visitor;

import org.example.menu.cardapio.DrinkMenu;
import org.example.menu.cardapio.MenuVisitor;
import org.example.menu.cardapio.PizzaMenu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuVisitorTest {
    @Test
    void deveExibirDrinkMenu() {
        DrinkMenu drinkMenu = new DrinkMenu("Bebidas Verão", "D01", "Alcoólicos");
        MenuVisitor visitor = new MenuVisitor();

        assertEquals("Menu Drink{matricula=D01, nome='Bebidas Verão', categoria=Alcoólicos}", visitor.exibir(drinkMenu));
    }

    @Test
    void deveExibirPizzaMenu() {
        PizzaMenu pizzaMenu = new PizzaMenu("Pizzas Tradicionais", "P01", "Salgadas");
        MenuVisitor visitor = new MenuVisitor();

        assertEquals("Menu Pizza{matricula=P01, nome='Pizzas Tradicionais', categoria='Salgadas'}", visitor.exibir(pizzaMenu));
    }
}
