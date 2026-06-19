package org.example.adress;

public class Adress {
    private String nome;
    private String uf;

    public Adress(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }
}
