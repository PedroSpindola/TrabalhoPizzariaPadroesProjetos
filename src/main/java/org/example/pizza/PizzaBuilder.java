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

    public PizzaBuilder(String pizza) {
        this.pizza = PizzaFactoryMethod.getPizza(pizza);
    }

    public PizzaBuilder setEmployers(UserEmployers employers) {
        pizza.setEmployers(employers);
        return this;
    }

    public PizzaBuilder setName(String name) {
        pizza.setName(name);
        return this;
    }

    public PizzaBuilder setBaseValue(float baseValue) {
        pizza.setBaseValue(baseValue);
        return this;
    }

    public PizzaBuilder setValue(BigDecimal value) {
        pizza.setValue(value);
        return this;
    }

    public PizzaBuilder setDough(IDough dough) {
        pizza.setDough(dough);
        return this;
    }

    public PizzaBuilder setEdge(IEdge edge) {
        pizza.setEdge(edge);
        return this;
    }

    public PizzaBuilder useFactory(IAbstractPizzaFactory pizzaFactory) {
        if (pizzaFactory != null) {
            pizza.setEdge(pizzaFactory.createEdge());
            pizza.setDough(pizzaFactory.createDough());
        }
        return this;
    }

    public Pizza build() {

        if (pizza.getDough() == null){
            throw new IllegalArgumentException("Invalid Dough");
        }
        if (pizza.getEdge() == null){
            throw new IllegalArgumentException("Invalid Edge");
        }
        if (pizza.getName() == ""){
            throw new IllegalArgumentException("Invalid Name");
        }
        if (pizza.getBaseValue() == 0){
            throw new IllegalArgumentException("Invalid Value");
        }

        return pizza;
    }
}
