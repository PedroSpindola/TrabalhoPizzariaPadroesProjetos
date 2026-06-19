package org.example.invoice;

import org.example.checkout.Checkout;
import org.example.departament.TaxDepartament;

import java.util.Arrays;
import java.util.List;

public class Invoice implements IInvoice {
    private Integer id;
    private String cliente;
    private String descricao;
    private Float valorSubtotal;
    private Float valorImposto;

    public Invoice(int id) {
        this.id = id;
        Invoice objeto = TaxDepartament.getInvoice(id);
        this.cliente = objeto.cliente;
        this.descricao = objeto.descricao;
        this.valorSubtotal = objeto.valorSubtotal;
        this.valorImposto = objeto.valorImposto;
    }

    public Invoice(Integer id, String cliente, String descricao, Float valorSubtotal, Float valorImposto) {
        this.id = id;
        this.cliente = cliente;
        this.descricao = descricao;
        this.valorSubtotal = valorSubtotal;
        this.valorImposto = valorImposto;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDadosGerais() {
        return Arrays.asList(this.cliente, this.descricao);
    }

    @Override
    public List<Float> obterValores(Checkout checkout) {
        return Arrays.asList(this.valorSubtotal, this.valorImposto);
    }
}

