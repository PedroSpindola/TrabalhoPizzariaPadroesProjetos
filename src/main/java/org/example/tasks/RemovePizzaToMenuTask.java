package org.example.tasks;

import org.example.menu.Menu;

public class RemovePizzaToMenuTask implements ITask {
    private static RemovePizzaToMenuTask instance = new RemovePizzaToMenuTask();
    private Menu menu;

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

    public String executar(){
        return "Remover menu:" +menu;
    }
}
