package org.example.user.methodFactory;

import org.example.user.Users;

public class UserFactory {

    public static Users getUser(String user){
        Class classe = null;
        Object object = null;

        try{
            classe = Class.forName("org.example.user.User" + user);
            object = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Usuario inexistente");
        }
        if (!(object instanceof Users)){
            throw new IllegalArgumentException("Usuario inválido");
        }
        return (Users) object;
    }
}
