package org.example.pizza;

import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.AbstractFactoryInterface.IDough;
import org.example.pizza.AbstractFactoryInterface.IEdge;
import org.example.user.UserEmployers;

import java.math.BigDecimal;

public abstract class Pizza {

    private UserEmployers employers;
    private String name;

    private IDough dough;
    private IEdge edge;

    protected BigDecimal value;

    protected Pizza(){}

    protected Pizza(BigDecimal value, String name, IAbstractPizzaFactory pizzaFactory){
        this.value = value;
        this.name = name;
        this.dough = pizzaFactory.createDough();
        this.edge = pizzaFactory.createEdge();
    }

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

    public String getDough() {
        return dough.make();
    }

    public String getEdge() {
        return edge.make();
    }
}
