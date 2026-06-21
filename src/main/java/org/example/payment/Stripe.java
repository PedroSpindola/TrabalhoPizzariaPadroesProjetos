package org.example.payment;

import org.example.payment.processor.IProcessor;

public class Stripe implements IProcessor
{

    protected String processorName;
    protected String clientName;
    protected String vendorName;
    protected float value;

    @Override
    public String process() {
        return "Payed with Stripe";
    }

    @Override
    public String getProcessor() {
        return "Stripe";
    }

    @Override
    public void setProcessor(String processor, float value, String vendorName, String clientName) {
        this.processorName = processor;
        this.clientName = clientName;
        this.value = value;
        this.vendorName = vendorName;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
