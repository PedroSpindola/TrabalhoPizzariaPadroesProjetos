package org.example.pizza.ingrendient;

import org.example.pizza.Pizza;
import org.example.pizza.PizzaDecorator;

public class Bacon extends PizzaDecorator {

    public Bacon(Pizza pizza){
        super(pizza);
    }

    @Override
    public float getPercentualAumentoServico() {
        return 0.10f;
    }
}
