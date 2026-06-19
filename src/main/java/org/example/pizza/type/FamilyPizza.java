package org.example.pizza.type;

import org.example.pizza.Pizza;

import java.math.BigDecimal;

public class FamilyPizza extends Pizza {
    private double PriceMult = 2.0;

    public FamilyPizza(String name, float value, Object factory) {
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
