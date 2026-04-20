package org.example.pizza.Dough;

import org.example.pizza.AbstractFactoryInterface.IDough;

public class SweetDough implements IDough
{
    private String name;
    private double price;

    @Override
    public String make() {
        return "Sweet Dough";
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
