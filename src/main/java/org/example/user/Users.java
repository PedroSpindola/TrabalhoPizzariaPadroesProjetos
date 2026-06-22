package org.example.user;

import org.example.adress.Adress;

public abstract class Users {

    protected String nome;
    protected Adress adress;

    public abstract String logar();
    public abstract String sair();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String obterUser() {
        return "User{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + adress.getNome() + '\'' +
                ", uf='" + adress.getUf() + '\'' +
                '}';
    }

}
