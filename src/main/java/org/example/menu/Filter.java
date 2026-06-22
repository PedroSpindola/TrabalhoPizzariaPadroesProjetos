package org.example.menu;

import org.example.pizza.Pizza;

import java.util.Iterator;

public class Filter {
    public static Integer contarPizzasAtivasNoMenu(Menu menu) {
        int quantidade = 0;
        for (Pizza pizza : menu) {
            if (pizza.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalPizzasNoMenu(Menu menu) {
        int quantidade = 0;
        for (Iterator<Pizza> it = menu.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();

        }
        return quantidade;
    }
}
