package org.example.calculator;

public class Number implements IExpressionInterpreter {
    private double numero;

    public Number(double numero) {
        this.numero = numero;
    }

    @Override
    public double interpretar() {
        return numero;
    }

    public double getNumero() {
        return this.numero;
    }
}
