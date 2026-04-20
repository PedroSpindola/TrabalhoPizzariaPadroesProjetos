package org.example.pizza.Edge;

import org.example.pizza.AbstractFactoryInterface.IEdge;

public class NormalEdge implements IEdge
{
    private String name;
    private double price;

    @Override
    public String make() {
        return "Normal Edge";
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
