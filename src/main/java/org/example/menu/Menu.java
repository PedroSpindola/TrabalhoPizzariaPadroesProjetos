package org.example.menu;

import org.example.menu.cardapio.Content;
import org.example.menu.cardapio.IVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class Menu implements Iterable<Filter>{
    private String nome;
    private String matricula;
    private String categoria;
    private List<Filter> filter = new ArrayList<Filter>();
    private Content cardapio;

    public Menu(String nome, String matricula, String categoria, Filter... filter){
        this.nome = nome;
        this.matricula = matricula;
        this.categoria = categoria;
        this.filter = Arrays.asList(filter);
    }

    public List<Filter> getFilter() {
        return filter;
    }

    public void setFilter(List<Filter> filter) {
        this.filter = filter;
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
    public Iterator<Filter> iterator() {
        return filter.iterator();
    }

}
