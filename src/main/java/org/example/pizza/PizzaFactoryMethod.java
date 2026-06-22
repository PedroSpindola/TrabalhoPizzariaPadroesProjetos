package org.example.pizza;

import org.example.user.Users;
import org.example.user.methodFactory.UserFactory;

public class PizzaFactoryMethod
{
    public static PizzaFactoryMethod instance = new PizzaFactoryMethod();

    public static PizzaFactoryMethod getInstance(){
        return instance;
    }

    public static Pizza getPizza(String pizza){
        Class classe = null;
        Object object = null;

        try{
            classe = Class.forName("org.example.pizza.size.PizzaSize" + pizza);
            object = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Pizza inexistente");
        }
        if (!(object instanceof Pizza)){
            throw new IllegalArgumentException("Pizza inválido");
        }
        return (Pizza) object;
    }
}
