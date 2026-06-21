package org.example.user.clients;

import org.example.adress.Adress;
import org.example.delivery.DefaultDelivery;
import org.example.delivery.IDelivery;
import org.example.delivery.PriorityDelivery;
import org.example.order.Order;
import org.example.user.Users;

import java.util.Observable;
import java.util.Observer;

public class UserClients extends Users implements Observer {

    private float valorTotalUltimaEntrega;
    private String ultNotificacao;

    public UserClients(String nome){
        this.nome = nome;
    }
    public UserClients(String nome, Adress adress){
        this.nome = nome;
        this.adress = adress;
    }

    public void setUltNotificacao(String ultNotificacao) {
        this.ultNotificacao = ultNotificacao;
    }
    public String getUltNotificacao() {
        return ultNotificacao;
    }
    public void addOrder(Order interesse){
        interesse.addObserver(this);
    }


    @Override
    public void update(Observable vaga, Object arg) {
        this.ultNotificacao = this.nome+ ", Situação atual é:"+ vaga.toString();
    }

    public float getValorTotalUltimaEntrega() {
        return valorTotalUltimaEntrega;
    }


    public void fecharPedidoEntregaPadrao() {
        IDelivery entregaPadrao = new DefaultDelivery();
        Order order = new Order();
        order.setDelivery(entregaPadrao);

        this.valorTotalUltimaEntrega = order.calcularValorEntrega();
    }

    public void fecharPedidoEntregaPrioritaria() {
        IDelivery entregaPrioritaria = new PriorityDelivery();
        Order order = new Order();
        order.setDelivery(entregaPrioritaria);

        this.valorTotalUltimaEntrega = order.calcularValorEntrega();
    }
    @Override
    public String logar() {
        return "Cliente logado";
    }
    @Override
    public String sair() {
        return "Cliente Saiu";
    }
    public boolean verificarPendencias() {
        return ClientFacade.verificarPendencias(this);
    }
}
