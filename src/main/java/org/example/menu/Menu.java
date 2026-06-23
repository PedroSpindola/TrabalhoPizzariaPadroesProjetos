package org.example.menu;

import org.example.menu.cardapio.Content;
import org.example.menu.cardapio.IVisitor;
import org.example.pizza.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class Menu implements Iterable<Pizza>{
    private String nome;
    private String matricula;
    private String categoria;
    private List<Pizza> pizza = new ArrayList<Pizza>();
    private Content cardapio;

    public Menu(String nome, String matricula, String categoria, Pizza... pizza){
        this.nome = nome;
        this.matricula = matricula;
        this.categoria = categoria;
        this.pizza = new ArrayList<>(Arrays.asList(pizza));
    }

    public List<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(List<Pizza> pizza) {
        this.pizza = pizza;
    }

    public String getCardapio() {
        if (this.cardapio == null) {
            throw new NullPointerException("Cardapio indisponivel");
        }
        return this.cardapio.getContent();

    }

    public void setCardapio(Content cardapio) {
        this.cardapio = cardapio;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract String aceitar(IVisitor visitor);

    @Override
    public Iterator<Pizza> iterator() {
        return pizza.iterator();
    }

    public void adicionarPizza(Pizza pizza) {
        this.pizza.add(pizza);
    }

    public void removerPizza(Pizza pizza) {
        this.pizza.remove(pizza);
    }

}
