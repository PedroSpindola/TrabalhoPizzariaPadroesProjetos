package org.example.pizza;

import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.AbstractFactoryInterface.IDough;
import org.example.pizza.AbstractFactoryInterface.IEdge;
import org.example.user.UserEmployers;

import java.math.BigDecimal;

public abstract class Pizza implements Cloneable {

    private UserEmployers employers;
    private String name;

    private IDough dough;
    private IEdge edge;
    private float baseValue;
    protected BigDecimal value;

    public Pizza(){}

    protected Pizza(BigDecimal value, String name, IAbstractPizzaFactory pizzaFactory){
        this.value = value;
        this.name = name;
        this.dough = pizzaFactory.createDough();
        this.edge = pizzaFactory.createEdge();
    }
    public Pizza(String name, float value, Object factory) {
        this.name = name;
        this.baseValue = value;
    }

    public final double CalculatePrice() {
        return this.baseValue * getPriceMult();
    }
    public abstract double getPriceMult();
    public abstract BigDecimal getValuePizza();

    public UserEmployers getEmployers() {
        return employers;
    }

    public void setEmployers(UserEmployers employers) {
        this.employers = employers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IDough getDough()
    {
        return dough;
    }

    public IEdge getEdge()
    {
        return edge;
    }

    public void setDough(IDough dough) {
        this.dough = dough;
    }

    public void setEdge(IEdge edge) {
        this.edge = edge;
    }

    public float getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(float baseValue) {
        this.baseValue = baseValue;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
