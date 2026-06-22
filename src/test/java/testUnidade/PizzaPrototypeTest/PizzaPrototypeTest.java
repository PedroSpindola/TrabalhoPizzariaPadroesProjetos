package testUnidade.PizzaPrototypeTest;

import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.Pizza;
import org.example.pizza.methodFactoryPizza.SweetPizzaFactory;
import org.example.pizza.size.PizzaSizeBig;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaPrototypeTest
{
    @Test
    public void testClone() throws CloneNotSupportedException {
        IAbstractPizzaFactory factory = new SweetPizzaFactory();
        Pizza pizza = new PizzaSizeBig(new BigDecimal("100.00"), factory);

        Pizza pizzaClone = pizza.clone();
        pizzaClone.setName("Pizza Clonadaaaaa");

        assertEquals("Name:Big Pizza", pizza.toString());
        assertEquals("Name:Pizza Clonadaaaaa", pizzaClone.toString());
    }
}
