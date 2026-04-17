package org.example.order;

public class Order {

    private OrderState orderState;

    public Order(){
        this.orderState = OrderStatePendent.getInstance();
    }

    public OrderState getOrderState() {
        return orderState;
    }
    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
    public void approvedOrder(){
        orderState.approvedOrder(this);
    }
    public void cancelOrder(){
        orderState.cancelOrder(this);
    }
    public void finalizedOrder(){
        orderState.finalizedOrder(this);
    }
    public void pendentOrder(){
        orderState.pendentOrder(this);
    }
    public void preparingOrder(){
        orderState.preparingOrder(this);
    }
    public void processingOrder(){
        orderState.processingOrder(this);
    }
}
