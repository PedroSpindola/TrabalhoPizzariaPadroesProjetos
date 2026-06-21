package org.example.menu.cardapio;

import org.example.menu.Filter;
import org.example.menu.Menu;

public class DrinkMenu extends Menu {
    public DrinkMenu(String nome, String matricula, String categoria, Filter... filter){
        super(nome,matricula,categoria, filter);
    }
    public String aceitar(IVisitor visitor) {
        return visitor.exibirDrinkMenu(this);
    }
}
