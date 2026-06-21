package org.example.user;

import org.example.tasks.VerifyInvoiceTask;

public class UserTaxEmployer extends UserEmployers{

    public UserTaxEmployer(UserEmployers next){
        taskList.add(VerifyInvoiceTask.getTask());
        setNextEmployer(next);
    }

    public UserTaxEmployer(){

    }

    @Override
    public String getEmployerJob() {
        return "Tax Employer";
    }

    @Override
    public String logar() {
        return "Empregado Fiscal logado";
    }
    @Override
    public String sair() {
        return "Empregador Fiscal Saiu";
    }
}
