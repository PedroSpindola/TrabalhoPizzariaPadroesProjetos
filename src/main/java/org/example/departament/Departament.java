package org.example.departament;

import org.example.user.UserClients;

import java.util.ArrayList;
import java.util.List;

public abstract class Departament {
    private String nome;
    private String id;
    private List<UserClients> userComPendencia = new ArrayList<UserClients>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addUserPendente(UserClients user) {
        this.userComPendencia.add(user);
    }

    public boolean verificarUserComPendencia(UserClients user) {
        return this.userComPendencia.contains(user);
    }
}
