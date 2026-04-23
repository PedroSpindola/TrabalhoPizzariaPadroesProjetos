package testUnidade.PizzaAbstractFactory;

import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.Pizza;
import org.example.pizza.methodFactoryPizza.NormalPizzaFactory;
import org.example.pizza.methodFactoryPizza.SweetPizzaFactory;
import org.example.pizza.size.PizzaSizeSmall;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest
{
    @Test
    public void shouldReturnSweetEdge()
    {
        IAbstractPizzaFactory factory = new SweetPizzaFactory();
        Pizza pizza = new PizzaSizeSmall(new BigDecimal("100.00"), factory);
        assertEquals("Sweet Edge", pizza.getEdge().make());
    }

    @Test
    public void shouldReturnNormalEdge()
    {
        IAbstractPizzaFactory factory = new NormalPizzaFactory();
        Pizza pizza = new PizzaSizeSmall(new BigDecimal("100.00"), factory);
        assertEquals("Normal Edge", pizza.getEdge().make());
    }

    @Test
    public void shouldReturnSweetDough()
    {
        IAbstractPizzaFactory factory = new SweetPizzaFactory();
        Pizza pizza = new PizzaSizeSmall(new BigDecimal("100.00"), factory);
        assertEquals("Sweet Dough", pizza.getDough().make());
    }

    @Test
    public void shouldReturnNormalDough()
    {
        IAbstractPizzaFactory factory = new NormalPizzaFactory();
        Pizza pizza = new PizzaSizeSmall(new BigDecimal("100.00"), factory);
        assertEquals("Normal Dough", pizza.getDough().make());
    }
}
