package org.example.user;

import org.example.tasks.AddPizzaMenuTask;

public class UserPizzaEmployer extends UserEmployers {

    public UserPizzaEmployer(UserEmployers next){
        taskList.add(AddPizzaMenuTask.getTask());
        setNextEmployer(next);
    }

    public UserPizzaEmployer(){

    }

    @Override
    public String getEmployerJob() {
        return "Pizza Employer";
    }

    @Override
    public String logar() {
        return "Empregado Pizza logado";
    }
    @Override
    public String sair() {
        return "Empregador Pizza Saiu";
    }
}
