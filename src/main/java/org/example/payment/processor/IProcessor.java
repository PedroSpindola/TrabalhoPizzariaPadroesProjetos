package org.example.payment.processor;

public interface IProcessor {
    String process();
    String getProcessor();
    void setProcessor(String processor, float value, String vendorName, String clientName);

}
