package org.example.pizza.methodFactoryPizza;

import org.example.pizza.AbstractFactoryInterface.IAbstractPizzaFactory;
import org.example.pizza.AbstractFactoryInterface.IDough;
import org.example.pizza.AbstractFactoryInterface.IEdge;
import org.example.pizza.Dough.NormalDough;
import org.example.pizza.Edge.NormalEdge;

public class NormalPizzaFactory implements IAbstractPizzaFactory
{

    private static NormalPizzaFactory instance;

    public NormalPizzaFactory getInstance()
    {
        if(instance == null)
        {
            instance = new NormalPizzaFactory();
        }
        return instance;
    }

    @Override
    public IEdge createEdge() {
        return new NormalEdge();
    }

    @Override
    public IDough createDough() {
        return new NormalDough();
    }
}
