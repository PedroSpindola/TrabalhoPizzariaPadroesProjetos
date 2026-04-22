package org.example.pizza.size;
import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.Pizza;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PizzaSizeBig extends Pizza
{
    public PizzaSizeBig(BigDecimal value, IAbstractPizzaFactory pizzaFactory)
    {
        super(value, "Big Pizza", pizzaFactory);
    }

    public BigDecimal getValuePizza()
    {
        return this.value.multiply(new BigDecimal("2.0")).setScale(2, RoundingMode.HALF_UP);
    }
}
