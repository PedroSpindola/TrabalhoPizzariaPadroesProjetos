package testUnidade.PizzaBuilder;

import org.example.pizza.AbstractFactoryInterface.IDough;
import org.example.pizza.Dough.SweetDough;
import org.example.pizza.Edge.SweetEdge;
import org.example.pizza.Pizza;
import org.example.pizza.PizzaBuilder;
import org.example.pizza.PizzaFactoryMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaBuilderTest
{

    @Test
    public void shouldReturnExceptionWhenNameIsNull()
    {
        try{
            PizzaBuilder pizzaBuilder = new PizzaBuilder("Big");
            Pizza pizza = pizzaBuilder
                    .setBaseValue(90)
                    .setDough(new SweetDough())
                    .setEdge(new SweetEdge())
                    .build();
            fail();
        }catch (Exception e){
            assertEquals("Invalid Name",e.getMessage());
        }
    }

    @Test
    public void shouldReturnExceptionWhenBaseValueIsNull()
    {
        try{
            PizzaBuilder pizzaBuilder = new PizzaBuilder("Big");
            Pizza pizza = pizzaBuilder
                    .setName("Margerita")
                    .setDough(new SweetDough())
                    .setEdge(new SweetEdge())
                    .build();
            fail();
        }catch (Exception e){
            assertEquals("Invalid Value",e.getMessage());
        }
    }

    @Test
    public void shouldReturnExceptionWhenDoughIsNull()
    {
        try{
            PizzaBuilder pizzaBuilder = new PizzaBuilder("Big");
            Pizza pizza = pizzaBuilder
                    .setName("Margerita")
                    .setBaseValue(40)
                    .setEdge(new SweetEdge())
                    .build();
            fail();
        }catch (Exception e){
            assertEquals("Invalid Dough",e.getMessage());
        }
    }

    @Test
    public void shouldReturnExceptionWhenEdgeIsNull()
    {
        try{
            PizzaBuilder pizzaBuilder = new PizzaBuilder("Big");
            Pizza pizza = pizzaBuilder
                    .setName("Margerita")
                    .setBaseValue(40)
                    .setDough(new SweetDough())
                    .build();
            fail();
        }catch (Exception e){
            assertEquals("Invalid Edge",e.getMessage());
        }
    }

    @Test
    public void shouldReturnAValidPizza()
    {
        PizzaBuilder pizzaBuilder = new PizzaBuilder("Big");
        Pizza pizza = pizzaBuilder
                .setName("Margerita")
                .setBaseValue(40)
                .setDough(new SweetDough())
                .setEdge(new SweetEdge())
                .build();
        assertNotNull(pizza);
    }
}
