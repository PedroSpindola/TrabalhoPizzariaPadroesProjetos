package org.example.checkout;

import org.example.payment.Payment;

public class Checkout {

    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
