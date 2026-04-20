package testUnidade.pizzaDecorator;

import org.example.pizza.PizzaDecorator;
import org.example.pizza.ingrendient.Bacon;
import org.example.pizza.ingrendient.Cheese;
import org.example.pizza.ingrendient.Chicken;
import org.example.pizza.ingrendient.Oregan;
import org.example.pizza.size.PizzaSizeBig;
import org.example.pizza.size.PizzaSizeSmall;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaSizeBigTest {
    @Test
    public void deveRetornarPizzaPequenaComBaconCheeseChickenOregan(){
        PizzaDecorator pizza = new Oregan(new Chicken(new Cheese(new Bacon(new PizzaSizeBig(200.0f)))));
        assertEquals(455.4f, pizza.getValuePizza(),0.1f);
    }
}
