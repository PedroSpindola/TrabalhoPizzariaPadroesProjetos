package org.example.pizza.type;

import org.example.pizza.Pizza;

import java.math.BigDecimal;

public class MiniPizza extends Pizza {
    private double PriceMult = 0.5;

    public MiniPizza(String name, float value, Object factory) {
        super(name, value, factory);
    }

    @Override
    public double getPriceMult() {
        return this.PriceMult;
    }

    @Override
    public BigDecimal getValuePizza() {
        return new BigDecimal(0.0);
    }
}
