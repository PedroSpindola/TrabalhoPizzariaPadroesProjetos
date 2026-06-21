package org.example.payment;

import org.example.checkout.Checkout;
import org.example.order.Order;
import org.example.payment.processor.IProcessor;
import org.example.payment.processor.ProcessorAdapter;

public abstract class Payment {

    protected IProcessor processor;
    protected ProcessorAdapter adapter;
    private Order order;
    private Checkout checkout;

    public Payment(){
        processor = new Stripe();
        adapter = new ProcessorAdapter(processor);
    }

    public void setProcessor( float value, String vendorName, String clientName){
        this.processor.setProcessor("MercadoPago", value, vendorName, clientName);
        adapter.saveMercadoPagoProcessor();
    }

    public String getStripeProcessor(){
        return adapter.recoverStripeProcessor();
    }

    public String getMercadoPagoProcessor(){
        return adapter.getProcessor();
    }

    public abstract String pay();

    public Checkout getCheckout() {
        return checkout;
    }

    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setProcessor(IProcessor processor) {
        this.processor = processor;
    }

    public IProcessor getProcessor() {
        return this.processor;
    }
}
