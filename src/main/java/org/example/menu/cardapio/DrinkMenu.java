package org.example.menu.cardapio;

import org.example.menu.Filter;
import org.example.menu.Menu;
import org.example.pizza.Pizza;

public class DrinkMenu extends Menu {
    public DrinkMenu(String nome, String matricula, String categoria, Pizza... pizza){
        super(nome,matricula,categoria, pizza);
    }
    public String aceitar(IVisitor visitor) {
        return visitor.exibirDrinkMenu(this);
    }
}
