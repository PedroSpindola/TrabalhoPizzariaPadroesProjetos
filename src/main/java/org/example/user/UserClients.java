package org.example.user;

public class UserClients extends Users{

    @Override
    public String logar() {
        return "Cliente logado";
    }
    @Override
    public String sair() {
        return "Cliente Saiu";
    }
}
