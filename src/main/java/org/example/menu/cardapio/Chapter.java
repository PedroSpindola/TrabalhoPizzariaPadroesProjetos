package org.example.menu.cardapio;

public class Chapter extends Content {
    public Chapter(String descricao){
        super(descricao);
    }
    public String getContent() {
        return "Tópico: " + this.getDescricao() + "\n";
    }
}
