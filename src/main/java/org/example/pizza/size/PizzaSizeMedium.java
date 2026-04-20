package org.example.pizza.size;
import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.Pizza;

public class PizzaSizeMedium  extends Pizza
{
    public PizzaSizeMedium(float value, String name, IAbstractPizzaFactory pizzaFactory)
    {
        super(value, name, pizzaFactory);
    }

    @Override
    public float getValuePizza()
    {
        return this.value * 1.5f;
    }
}
