package org.example.pizza.methodFactoryPizza;

import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.AbstractFactoryInterface.IDough;
import org.example.pizza.AbstractFactoryInterface.IEdge;
import org.example.pizza.Dough.SweetDough;
import org.example.pizza.Edge.SweetEdge;

public class SweetPizzaFactory implements IAbstractPizzaFactory {

    private static SweetPizzaFactory instance;

    public SweetPizzaFactory getInstance()
    {
        if(instance == null)
        {
            instance = new SweetPizzaFactory();
        }
        return instance;
    }

    @Override
    public IEdge createEdge() {
        return new SweetEdge();
    }

    @Override
    public IDough createDough() {
        return new SweetDough();
    }
}
