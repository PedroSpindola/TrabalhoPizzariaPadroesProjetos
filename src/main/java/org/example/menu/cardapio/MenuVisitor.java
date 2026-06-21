package org.example.menu.cardapio;

import org.example.menu.Menu;

public class MenuVisitor implements IVisitor {
    public String exibir(Menu menu) {
        return menu.aceitar(this);
    }

    @Override
    public String exibirDrinkMenu(DrinkMenu drinkMenu) {
        return "Menu Drink{" +
                "matricula=" + drinkMenu.getMatricula() +
                ", nome='" + drinkMenu.getNome() + '\'' +
                ", categoria=" + drinkMenu.getCategoria() +
                '}';
    }

    @Override
    public String exibirPizzaMenu(PizzaMenu pizzaMenu) {
        return "Menu Pizza{" +
                "matricula=" + pizzaMenu.getMatricula() +
                ", nome='" + pizzaMenu.getNome() + '\'' +
                ", categoria='" + pizzaMenu.getCategoria() + '\'' +
                '}';
    }
}
