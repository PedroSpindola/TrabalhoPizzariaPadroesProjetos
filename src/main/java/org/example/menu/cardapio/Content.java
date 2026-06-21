package org.example.menu.cardapio;

public abstract class Content {
    private String descricao;

    public Content(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getContent();
}
