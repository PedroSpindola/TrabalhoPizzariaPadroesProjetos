package org.example.adress;

import java.util.HashMap;
import java.util.Map;

public class AdressFactory {
    private static AdressFactory instance = new AdressFactory();
    private AdressFactory(){}

    private static AdressFactory getInstance(){
        return instance;
    }
    private static Map<String, Adress> adresses = new HashMap<>();

    public static Adress getAdress(String nome, String uf) {
        Adress adress = adresses.get(nome);
        if (adress == null) {
            adress = new Adress(nome, uf);
            adresses.put(nome, adress);
        }
        return adress;
    }

    public static int getTotalAdresses() {
        return adresses.size();
    }
}
