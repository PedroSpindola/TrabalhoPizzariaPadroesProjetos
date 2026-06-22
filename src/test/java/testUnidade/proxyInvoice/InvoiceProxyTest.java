package testUnidade.proxyInvoice;

import org.example.checkout.Checkout;
import org.example.departament.TaxDepartament;
import org.example.invoice.Invoice;
import org.example.invoice.InvoiceProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class InvoiceProxyTest {

    @BeforeEach
    void setUp() {
        TaxDepartament.addInvoice(new Invoice(1, "Empresa A", "Serviços de TI", 1000.0f, 150.0f));
        TaxDepartament.addInvoice(new Invoice(2, "Empresa B", "Consultoria", 2000.0f, 300.0f));
    }

    @Test
    void deveRetornarDadosGeraisInvoice() {
        InvoiceProxy invoice = new InvoiceProxy(1);
        assertEquals(Arrays.asList("Empresa A", "Serviços de TI"), invoice.obterDadosGerais());
    }

    @Test
    void deveRetornarValoresInvoice() {
        Checkout checkout = new Checkout(true);
        InvoiceProxy invoice = new InvoiceProxy(2);

        assertEquals(Arrays.asList(2000.0f, 300.0f), invoice.obterValores(checkout));
    }

    @Test
    void deveRetornarExcecaoUsuarioNaoAutorizadoConsultarValoresInvoice() {
        try {
            Checkout checkout = new Checkout(false);
            InvoiceProxy invoice = new InvoiceProxy(2);

            invoice.obterValores(checkout);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Checkout não autorizado", e.getMessage());
        }
    }
}
