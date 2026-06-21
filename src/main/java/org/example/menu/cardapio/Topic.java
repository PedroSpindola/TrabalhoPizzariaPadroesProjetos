package org.example.menu.cardapio;

public class Topic extends Content {
    public Topic(String descricao){
        super(descricao);
    }

    public String getContent() {
        return "Tópico: " + this.getDescricao() +"\n";
    }
}
