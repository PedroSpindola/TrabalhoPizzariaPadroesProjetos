package testUnidade.PaymentBridge;

import org.example.payment.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTest
{
    @Test
    public void shouldReturnCreditCardPaymentWithStripe(){
        IProcessor processor = new Stripe();
        Payment payment = new CreditCard();
        payment.setProcessor(processor);
        assertEquals("Payed with Stripe and Credit Card",   payment.getProcessor().process() + " and " + payment.pay());
    }

    @Test
    public void shouldReturnCreditCardPaymentWithMercadoPago(){
        IProcessor processor = new MercadoPago();
        Payment payment = new CreditCard();
        payment.setProcessor(processor);
        assertEquals("Payed with Mercado Pago and Credit Card",   payment.getProcessor().process() + " and " + payment.pay());
    }

}
