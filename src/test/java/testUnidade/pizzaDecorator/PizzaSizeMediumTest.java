package testUnidade.pizzaDecorator;

import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.PizzaDecorator;
import org.example.pizza.ingrendient.Bacon;
import org.example.pizza.ingrendient.Cheese;
import org.example.pizza.ingrendient.Chicken;
import org.example.pizza.ingrendient.Oregan;
import org.example.pizza.methodFactoryPizza.NormalPizzaFactory;
import org.example.pizza.size.PizzaSizeMedium;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaSizeMediumTest {
    @Test
    public void deveRetornarPizzaPequenaComBaconCheeseChickenOregan()
    {
        IAbstractPizzaFactory pizzaFactory = new NormalPizzaFactory();
        PizzaDecorator pizza = new Oregan(new Chicken(new Cheese(new Bacon(new PizzaSizeMedium(new BigDecimal("100.0"), pizzaFactory)))));
        BigDecimal expected = new BigDecimal("341.55");
        assertEquals(0, expected.compareTo(pizza.getValuePizza()), "The value most be was a expected");
    }
}
