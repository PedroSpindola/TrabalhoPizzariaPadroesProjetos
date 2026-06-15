package org.example.service;

public class ServiceNotifier implements IService{
    private static ServiceNotifier instance = new ServiceNotifier();

    private ServiceNotifier(){}

    public static ServiceNotifier getInstance(){
        return instance;
    }

    @Override
    public String avaliarServico(String mensagem) {
        return "O sistema de notificação agradece a avaliação:" + mensagem;
    }
}
