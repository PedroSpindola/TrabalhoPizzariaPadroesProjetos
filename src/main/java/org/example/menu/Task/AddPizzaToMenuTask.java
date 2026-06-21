package org.example.menu.Task;

import org.example.menu.Menu;

public class AddPizzaToMenuTask implements ITask{
    private static AddPizzaToMenuTask instance = new AddPizzaToMenuTask();
    private Menu menu;

    private AddPizzaToMenuTask(){}

    public static AddPizzaToMenuTask getInstance(){
        return instance;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String executar(){
        return "Adicionar menu:" +menu;
    }
}

