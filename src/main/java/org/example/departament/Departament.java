package org.example.departament;

import org.example.user.UserClients;

import java.util.ArrayList;
import java.util.List;

public abstract class Departament {
    private List<UserClients> userComPendencia = new ArrayList<UserClients>();

    public void addUserPendente(UserClients user) {
        this.userComPendencia.add(user);
    }

    public boolean verificarUserComPendencia(UserClients user) {
        return this.userComPendencia.contains(user);
    }
}
