package org.example.order;

import org.example.service.IService;

public class OrderMediator {

    private static OrderMediator instance = new OrderMediator();

    private OrderMediator(){}

    public static OrderMediator getInstance(){
        return  instance;
    }

    public String receberAlteracaoOrder(IService service, String mensagem) {
        return "respondeu sua demanda conforme mensagem a seguir.\n" + ">>" + service.avaliarServico(mensagem);
    }

}
