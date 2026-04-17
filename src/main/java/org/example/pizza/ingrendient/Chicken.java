package org.example.pizza.ingrendient;

import org.example.pizza.Pizza;
import org.example.pizza.PizzaDecorator;

public class Chicken extends PizzaDecorator {

    public Chicken(Pizza pizza){
        super(pizza);
    }

    @Override
    public float getPercentualAumentoServico() {
        return 0.15f;
    }
}
