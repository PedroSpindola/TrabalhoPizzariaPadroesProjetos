package org.example.invoice;

import org.example.checkout.Checkout;

import java.util.List;

public class InvoiceProxy implements IInvoice{
    private Invoice invoice;
    private Integer id;

    public InvoiceProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> obterDadosGerais() {
        if (this.invoice == null) {
            this.invoice = new Invoice(this.id);
        }
        return this.invoice.obterDadosGerais();
    }

    @Override
    public List<Float> obterValores(Checkout checkout) {

        if (this.invoice == null) {
            this.invoice = new Invoice(this.id);
        }
        if (!checkout.isAutorizado()) {
            throw new IllegalArgumentException("Checkout não autorizado");
        }
        return this.invoice.obterValores(checkout);
    }
}
