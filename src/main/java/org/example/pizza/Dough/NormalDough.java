package org.example.pizza.Dough;

import org.example.pizza.AbstractFactoryInterface.IDough;

public class NormalDough implements IDough
{
    private String name;
    private double price;

    @Override
    public String make() {
        return "Normal Dough";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
