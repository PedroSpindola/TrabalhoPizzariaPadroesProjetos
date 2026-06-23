package org.example.tasks;

import org.example.menu.Menu;
import org.example.pizza.Pizza;

public class RemovePizzaToMenuTask implements ITask {

    private static RemovePizzaToMenuTask instance = new RemovePizzaToMenuTask();
    private Menu menu;
    private Pizza pizza;

    private RemovePizzaToMenuTask(){}

    public static RemovePizzaToMenuTask getInstance(){
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
        menu.removerPizza(pizza);
    }
}
