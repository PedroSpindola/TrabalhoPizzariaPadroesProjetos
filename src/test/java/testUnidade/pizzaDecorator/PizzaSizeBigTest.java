package testUnidade.pizzaDecorator;

import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.PizzaDecorator;
import org.example.pizza.ingrendient.Bacon;
import org.example.pizza.ingrendient.Cheese;
import org.example.pizza.ingrendient.Chicken;
import org.example.pizza.ingrendient.Oregan;
import org.example.pizza.methodFactoryPizza.NormalPizzaFactory;
import org.example.pizza.size.PizzaSizeBig;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaSizeBigTest {
    @Test
    public void deveRetornarPizzaPequenaComBaconCheeseChickenOregan()
    {
        IAbstractPizzaFactory pizzaFactory = new NormalPizzaFactory();
        PizzaDecorator pizza = new Oregan(new Chicken(new Cheese(new Bacon(new PizzaSizeBig(new BigDecimal("100.0"), pizzaFactory)))));
        BigDecimal esperado = new BigDecimal("455.40");
        assertEquals(0, esperado.compareTo(pizza.getValuePizza()), "The value most be was a expected");
    }
}
