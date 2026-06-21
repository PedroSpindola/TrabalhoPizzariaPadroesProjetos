package org.example.adress;

import org.example.user.clients.UserClients;
import org.example.user.Users;

import java.util.ArrayList;
import java.util.List;

public class AdressDB {
    private List<Users> users = new ArrayList<>();

    public void cadastrarUser(String nomeUser, String nomeCidade, String uf) {
        Adress adress = AdressFactory.getAdress(nomeCidade, uf);
        Users user = new UserClients(nomeUser, adress) {};

        users.add(user);
    }

    public List<String> obterUsers() {
        List<String> saida = new ArrayList<>();
        for (Users user : this.users) {
            saida.add(user.obterUser());
        }
        return saida;
    }
}
