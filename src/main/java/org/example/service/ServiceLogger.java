package org.example.service;

public class ServiceLogger implements IService{

    private static ServiceLogger instance = new ServiceLogger();

    private ServiceLogger(){}

    public static ServiceLogger getInstance(){
        return instance;
    }

    @Override
    public String avaliarServico(String mensagem) {
        return "O sistema de notificação agradece a avaliação:" + mensagem;
    }
}
