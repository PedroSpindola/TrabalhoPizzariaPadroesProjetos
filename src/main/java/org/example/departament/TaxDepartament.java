package org.example.departament;

import org.example.invoice.Invoice;

import java.util.HashMap;
import java.util.Map;

public class TaxDepartament {
    private static TaxDepartament instance = new TaxDepartament();
    private TaxDepartament(){}

    private static TaxDepartament getInstance(){
        return instance;
    }
    private static Map<Integer, Invoice> invoices = new HashMap<>();

    public static Invoice getInvoice(Integer matricula) {
        return invoices.get(matricula);
    }

    public static void addInvoice(Invoice invoice) {
        invoices.put(invoice.getId(), invoice);
    }
}
