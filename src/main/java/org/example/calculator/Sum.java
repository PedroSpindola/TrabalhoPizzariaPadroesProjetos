package org.example.calculator;

public class Sum implements IExpressionInterpreter{
    private double x;
    private double y;

    public Sum(Number elementoEsquerda, Number elementoDireita) {
        this.x = elementoEsquerda.getNumero();
        this.y = elementoDireita.getNumero();
    }

    @Override
    public double interpretar() {
        return x + y;
    }
}
