package org.example.pizza.ingrendient;

import org.example.pizza.Pizza;
import org.example.pizza.PizzaDecorator;

import java.math.BigDecimal;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza){
        super(pizza);
    }

    @Override
    public BigDecimal getPercentualAumentoServico()
    {
        return new BigDecimal( 0.20);
    }
}
