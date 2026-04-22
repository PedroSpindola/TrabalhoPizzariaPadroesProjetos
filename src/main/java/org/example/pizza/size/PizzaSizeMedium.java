package org.example.pizza.size;
import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.Pizza;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PizzaSizeMedium  extends Pizza
{
    public PizzaSizeMedium(BigDecimal value, IAbstractPizzaFactory pizzaFactory)
    {
        super(value, "Medium pizza", pizzaFactory);
    }

    @Override
    public BigDecimal getValuePizza()
    {
        return this.value.multiply(new BigDecimal("1.5")).setScale(2, RoundingMode.HALF_UP);
    }
}
