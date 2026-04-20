package org.example.pizza.size;
import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.Pizza;

public class PizzaSizeBig extends Pizza
{
    public PizzaSizeBig(float value, String name, IAbstractPizzaFactory pizzaFactory)
    {
        super(value, name, pizzaFactory);
    }

    public float getValuePizza()
    {
        return this.value * 2;
    }
}
