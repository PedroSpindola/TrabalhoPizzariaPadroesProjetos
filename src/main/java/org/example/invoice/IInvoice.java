package org.example.invoice;

import org.example.checkout.Checkout;
import org.example.departament.TaxDepartament;

import java.util.List;

public interface IInvoice {
    List<String> obterDadosGerais();
    List<Float> obterValores(Checkout checkout);
}
