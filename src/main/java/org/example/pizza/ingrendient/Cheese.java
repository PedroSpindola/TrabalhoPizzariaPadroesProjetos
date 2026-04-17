package org.example.pizza.ingrendient;

import org.example.pizza.Pizza;
import org.example.pizza.PizzaDecorator;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza){
        super(pizza);
    }

    @Override
    public float getPercentualAumentoServico() {
        return 0.20f;
    }
}
