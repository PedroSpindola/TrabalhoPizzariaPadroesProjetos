package org.example.pizza.size;
import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.Pizza;

public class PizzaSizeSmall extends Pizza
{

    public PizzaSizeSmall(float value, String name, IAbstractPizzaFactory pizzaFactory)
    {
        super(value, name, pizzaFactory);

    }

    @Override
    public float getValuePizza() {
        return this.value * 1.2f;
    }
}
