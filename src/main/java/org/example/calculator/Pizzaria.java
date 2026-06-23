package org.example.calculator;

public class Pizzaria {
    public static String formula = "precoPizza + taxaEntrega - descontoCupom";

    public static double calcularTotalPedido(double precoPizza, double taxaEntrega, double descontoCupom) {
        String expressao;


        expressao = formula.replace("precoPizza", Double.toString(precoPizza));
        expressao = expressao.replace("taxaEntrega", Double.toString(taxaEntrega));
        expressao = expressao.replace("descontoCupom", Double.toString(descontoCupom));

        IExpressionInterpreter interpretador = new OrderInterpreter(expressao);
        return interpretador.interpretar();
    }
}
