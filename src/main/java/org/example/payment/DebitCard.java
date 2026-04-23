package org.example.payment;

public class DebitCard extends Payment{
    @Override
    public String pay() {
        return "Debit Card";
    }
}
