package org.example.menu.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Chapter extends Content {
    private List<Content> conteudos = new ArrayList<>();

    public Chapter(String descricao){
        super(descricao);
    }

    public void addConteudo(Content conteudo) {
        this.conteudos.add(conteudo);
    }
    @Override
    public String getContent() {

        StringBuilder sb = new StringBuilder();
        sb.append("Tópico: ").append(this.getDescricao()).append("\n");
        for (Content c : conteudos) {
            sb.append(c.getContent());
        }
        return sb.toString();
    }
}
