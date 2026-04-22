package org.example.pizza;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class PizzaDecorator extends Pizza {
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    public abstract BigDecimal getPercentualAumentoServico();

    @Override
    public BigDecimal getValuePizza() {
        BigDecimal amount = this.pizza.getValuePizza();
        BigDecimal percent = new BigDecimal("1").add(this.getPercentualAumentoServico());
        return amount.multiply(percent).setScale(2, RoundingMode.HALF_UP);
    }
}
