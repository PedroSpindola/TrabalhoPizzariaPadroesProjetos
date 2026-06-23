package testUnidade.command;

import org.example.menu.cardapio.PizzaMenu;
import org.example.pizza.Pizza;
import org.example.pizza.type.FamilyPizza;
import org.example.tasks.AddPizzaMenuTask;
import org.example.tasks.RemovePizzaToMenuTask;
import org.example.user.UserEmployers;
import org.example.user.UserPizzaEmployer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class commandEmployersTest {
    private PizzaMenu menu;
    private Pizza pizzaCalabresa;
    private UserPizzaEmployer funcionario;

    @BeforeEach
    void setUp() {
        menu = new PizzaMenu("Cardápio Principal", "001", "Pizzas");
        pizzaCalabresa = new FamilyPizza("Calabresa Família", 50.0f, null);
    }

    @Test
    void deveAdicionarPizzaAoMenu() {

        AddPizzaMenuTask adicionarTarefa = AddPizzaMenuTask.getInstance();
        adicionarTarefa.setMenu(menu);
        adicionarTarefa.setPizza(pizzaCalabresa);

        adicionarTarefa.executar();

        assertEquals(1, menu.getPizza().size());
        assertTrue(menu.getPizza().contains(pizzaCalabresa));
    }

    @Test
    void deveRemoverPizzaDoMenu() {
        menu.adicionarPizza(pizzaCalabresa);

        RemovePizzaToMenuTask removerTarefa = RemovePizzaToMenuTask.getInstance();
        removerTarefa.setMenu(menu);
        removerTarefa.setPizza(pizzaCalabresa);

        removerTarefa.executar();

        assertEquals(0, menu.getPizza().size());
        assertFalse(menu.getPizza().contains(pizzaCalabresa));
    }

    @Test
    void deveExecutarSequenciaDeComandosNoMenu() {
        AddPizzaMenuTask adicionarTarefa = AddPizzaMenuTask.getInstance();
        RemovePizzaToMenuTask removerTarefa = RemovePizzaToMenuTask.getInstance();

        adicionarTarefa.setMenu(menu);
        adicionarTarefa.setPizza(pizzaCalabresa);
        adicionarTarefa.executar();
        assertEquals(1, menu.getPizza().size());

        removerTarefa.setMenu(menu);
        removerTarefa.setPizza(pizzaCalabresa);
        removerTarefa.executar();

        assertEquals(0, menu.getPizza().size());
    }
}



