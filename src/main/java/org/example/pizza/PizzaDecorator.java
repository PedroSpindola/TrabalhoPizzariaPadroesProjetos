package org.example.pizza;

public abstract class PizzaDecorator implements Pizza {
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
    public abstract float getPercentualAumentoServico();
    @Override
    public float getValuePizza() {
        return this.pizza.getValuePizza()*(1+this.getPercentualAumentoServico());
    }
}
