package org.example.payment;

public class CreditCard extends Payment{
    @Override
    public String pay() {
        return "Credit Card";
    }
}
