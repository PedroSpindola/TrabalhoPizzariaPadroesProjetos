package org.example.order;

import org.example.delivery.IDelivery;
import org.example.payment.Payment;
import org.example.service.ServiceNotifier;
import org.example.user.clients.UserClients;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Order extends Observable {

    private OrderState orderState;
    private Payment payment;
    private UserClients clients;
    private IDelivery delivery;

    private ArrayList<OrderState> memento = new ArrayList<OrderState>();

    public Order(){
        this.orderState = OrderStatePendent.getInstance();
    }

    public OrderState getOrderState() {
        return orderState;
    }
    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
        this.memento.add(this.orderState);
    }
    public boolean approvedOrder(){
        return orderState.approvedOrder(this);
    }
    public boolean cancelOrder(){
        return orderState.cancelOrder(this);
    }
    public boolean finalizedOrder(){
        return orderState.finalizedOrder(this);
    }
    public boolean pendentOrder(){
        return orderState.pendentOrder(this);
    }
    public boolean preparingOrder(){
        return orderState.preparingOrder(this);
    }
    public boolean processingOrder(){
        return orderState.processingOrder(this);
    }
    public boolean sendOrder(){return orderState.sendOrder(this);}

    public void avisarVaga() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "O estado do seu pedido é "+getEstados();
    }

    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }
    public float calcularValorEntrega() {
        return this.delivery.calcularEntrega(this);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.orderState = this.memento.get(indice);
    }

    public List<OrderState> getEstados() {
        return this.memento;
    }
    public String notifierAlteracao(){
        return OrderMediator.getInstance().receberAlteracaoOrder(ServiceNotifier.getInstance(),"Estatos alterado para" +getOrderState());
    }
    public String loggerAlteracao(){
        return OrderMediator.getInstance().receberAlteracaoOrder(ServiceNotifier.getInstance(),"Estado alterado para" +getOrderState());
    }

}
