package org.example.payment;

public class MercadoPago implements IProcessor{

    @Override
    public String process() {
        return "Payed with Mercado Pago";
    }
}
