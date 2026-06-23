package org.example.tasks;

import org.example.menu.Menu;
import org.example.pizza.Pizza;

public class AddPizzaMenuTask implements ITask {

    private static AddPizzaMenuTask instance = new AddPizzaMenuTask();
    private Menu menu;
    private Pizza pizza;

    private AddPizzaMenuTask(){}


    public static ITask getTask()
    {
        return instance;
    }

    public static AddPizzaMenuTask getInstance() {
        return instance;
    }


    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void executar() {
        menu.adicionarPizza(pizza);
    }
}
