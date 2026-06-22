package testUnidade.TemplateMethodTest;

import org.example.pizza.Pizza;
import org.example.pizza.size.PizzaSizeBig;
import org.example.pizza.size.PizzaSizeMedium;
import org.example.pizza.size.PizzaSizeSmall;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTemplateTest
{
    @Test
    public void shouldReturnBigPizzavalue(){
        Pizza pizza = new PizzaSizeBig();
        assertEquals(2,pizza.getPriceMult());
    }

    @Test
    public void shouldReturnMediumPizzavalue(){
        Pizza pizza = new PizzaSizeMedium();
        assertEquals(1.5,pizza.getPriceMult());
    }

    @Test
    public void shouldReturnSmallPizzavalue(){
        Pizza pizza = new PizzaSizeSmall();
        assertEquals(1,pizza.getPriceMult());
    }


}

