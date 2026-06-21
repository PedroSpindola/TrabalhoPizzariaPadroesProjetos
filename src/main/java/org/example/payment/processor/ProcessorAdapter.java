package org.example.payment.processor;

import org.example.payment.MercadoPago;
import org.example.payment.Stripe;

public class ProcessorAdapter extends MercadoPago
{
    private IProcessor stripeProcessor;

    public ProcessorAdapter(IProcessor stripeProcessor){
        this.stripeProcessor = stripeProcessor;
    }

    public String recoverStripeProcessor(){
        this.stripeProcessor.setProcessor("Stripe", this.value, this.vendorName, this.clientName);
        return stripeProcessor.getProcessor();
    }

    public void saveMercadoPagoProcessor(){
        Stripe data = (Stripe) stripeProcessor;
        this.processorName = data.getProcessor();
        this.clientName = data.getClientName();
        this.value = data.getValue();
        this.vendorName = data.getVendorName();
        this.setProcessor(data.getProcessor(), data.getValue(), data.getVendorName(), data.getClientName());
    }

    
}
