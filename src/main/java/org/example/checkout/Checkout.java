package org.example.checkout;

import org.example.payment.Payment;

public class Checkout {

    private Boolean isAutorizado;
    private Payment payment;

    public Checkout(){}
    public Checkout(Boolean autorizado){
        this.isAutorizado = autorizado;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public boolean isAutorizado() {
        return isAutorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.isAutorizado = autorizado;
    }
}
