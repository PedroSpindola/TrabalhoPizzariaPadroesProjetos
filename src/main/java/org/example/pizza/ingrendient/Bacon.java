package org.example.pizza.ingrendient;

import org.example.pizza.Pizza;
import org.example.pizza.PizzaDecorator;

import java.math.BigDecimal;

public class Bacon extends PizzaDecorator {

    public Bacon(Pizza pizza){
        super(pizza);
    }

    @Override
    public BigDecimal getPercentualAumentoServico()
    {
        return new BigDecimal( 0.10);
    }
}
