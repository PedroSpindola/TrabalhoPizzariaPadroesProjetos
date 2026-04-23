package org.example.payment;

public class Stripe implements IProcessor
{
    @Override
    public String process() {
        return "Payed with Stripe";
    }
}
