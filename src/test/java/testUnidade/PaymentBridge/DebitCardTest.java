package testUnidade.PaymentBridge;

import org.example.payment.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebitCardTest
{

    @Test
    public void shouldReturnDebitCardPaymentWithStripe(){
        IProcessor processor = new Stripe();
        Payment payment = new DebitCard();
        payment.setProcessor(processor);
        assertEquals("Payed with Stripe and Debit Card",   payment.getProcessor().process() + " and " + payment.pay());
    }

    @Test
    public void shouldReturnDebitCardPaymentWithMercadoPago(){
        IProcessor processor = new MercadoPago();
        Payment payment = new DebitCard();
        payment.setProcessor(processor);
        assertEquals("Payed with Mercado Pago and Debit Card",   payment.getProcessor().process() + " and " + payment.pay());
    }

}
