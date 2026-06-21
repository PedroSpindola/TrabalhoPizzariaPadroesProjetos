package testUnidade.ProcessorAdapterTests;

import org.example.payment.CreditCard;
import org.example.payment.Payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessorTest
{
    @Test
    public void shouldReturnMercadoPagoProcessor()
    {
        Payment payment = new CreditCard();
        payment.setProcessor( 90, "Marcelo", "Carlos" );
        assertEquals("Mercado Pago", payment.getMercadoPagoProcessor());
    }

    @Test
    public void shouldReturnStripeProcessor()
    {
        Payment payment = new CreditCard();
        payment.setProcessor( 90, "Marcelo", "Carlos" );
        assertEquals("Stripe", payment.getStripeProcessor());
    }


}
