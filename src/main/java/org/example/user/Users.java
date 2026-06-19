package org.example.user;

import org.example.adress.Adress;

public abstract class Users {

    protected String nome;
    protected Adress adress;

    public abstract String logar();
    public abstract String sair();

    public String obterUser() {
        return "User{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + adress.getNome() + '\'' +
                ", uf='" + adress.getUf() + '\'' +
                '}';
    }

}
