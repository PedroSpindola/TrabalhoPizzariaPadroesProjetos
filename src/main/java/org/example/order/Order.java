package org.example.order;

import org.example.payment.Payment;
import org.example.service.ServiceNotifier;
import org.example.user.UserClients;

public class Order {

    private OrderState orderState;
    private Payment payment;
    private UserClients clients;

    public Order(){
        this.orderState = OrderStatePendent.getInstance();
    }

    public OrderState getOrderState() {
        return orderState;
    }
    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
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

    public String notifierAlteracao(){
        return OrderMediator.getInstance().receberAlteracaoOrder(ServiceNotifier.getInstance(),"Estatos alterado para" +getOrderState());
    }
    public String loggerAlteracao(){
        return OrderMediator.getInstance().receberAlteracaoOrder(ServiceNotifier.getInstance(),"Estado alterado para" +getOrderState());
    }

}
