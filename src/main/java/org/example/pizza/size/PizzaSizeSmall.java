package org.example.pizza.size;
import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.Pizza;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PizzaSizeSmall extends Pizza
{
    public PizzaSizeSmall(BigDecimal value, IAbstractPizzaFactory pizzaFactory)
    {
        super(value, "Small Pizza", pizzaFactory);
    }

    @Override
    public BigDecimal getValuePizza()
    {
        return this.value.multiply(new BigDecimal("1.2")).setScale(2, RoundingMode.HALF_UP);
    }
}
