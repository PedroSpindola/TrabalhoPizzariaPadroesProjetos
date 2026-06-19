package org.example.pizza;

import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.AbstractFactoryInterface.IDough;
import org.example.pizza.AbstractFactoryInterface.IEdge;
import org.example.pizza.type.FamilyPizza;
import org.example.pizza.type.MiniPizza;
import org.example.pizza.type.NormalPizza;
import org.example.user.UserEmployers;
import java.math.BigDecimal;

public class PizzaBuilder {
    private Pizza pizza;
    private UserEmployers employers;
    private String name;
    private IDough dough;
    private IEdge edge;
    private float baseValue;
    private BigDecimal value;

    private String sizeType = "normal";

    public PizzaBuilder() {

    }

    public PizzaBuilder setEmployers(UserEmployers employers) {
        this.employers = employers;
        return this;
    }

    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder setBaseValue(float baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    public PizzaBuilder setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public PizzaBuilder setDough(IDough dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setEdge(IEdge edge) {
        this.edge = edge;
        return this;
    }

    public PizzaBuilder useFactory(IAbstractPizzaFactory pizzaFactory) {
        if (pizzaFactory != null) {
            this.dough = pizzaFactory.createDough();
            this.edge = pizzaFactory.createEdge();
        }
        return this;
    }

    public PizzaBuilder setSizeType(String sizeType) {
        this.sizeType = sizeType.toLowerCase();
        return this;
    }

    public Pizza build() {

        pizza.setEmployers(this.employers);
        pizza.setValue(this.value);
        if (this.dough != null) pizza.setDough(this.dough);
        if (this.edge != null) pizza.setEdge(this.edge);

        return pizza;
    }
}
