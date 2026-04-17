package org.example.pizza.size;

import org.example.pizza.Pizza;

public abstract class PizzaSize implements Pizza {

    protected float value;

    public PizzaSize(){}
    public PizzaSize(float value){
        this.value=value;
    }
    public float getValuePizza(){
        return value;
    }
}
