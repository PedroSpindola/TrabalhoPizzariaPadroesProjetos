package org.example.calculator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class OrderInterpreter implements IExpressionInterpreter {
    private IExpressionInterpreter interpretadorInicial;

    public OrderInterpreter(String contexto) {
        Stack<IExpressionInterpreter> pilhaInterpretadores = new Stack<>();
        List<String> elementos = Arrays.asList(contexto.split(" "));
        Iterator<String> iterator = elementos.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();


            if (elemento.matches("\\d+(\\.\\d*)?")) {
                pilhaInterpretadores.push(new Number(Double.parseDouble(elemento)));
            }

            else if (elemento.equals("+")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");

                Number elementoEsquerda = (Number) pilhaInterpretadores.pop();
                Number elementoDireita = new Number(Double.parseDouble(iterator.next()));

                Sum interpretador = new Sum(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Number(interpretador.interpretar()));
            }
            else if (elemento.equals("-")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");

                Number elementoEsquerda = (Number) pilhaInterpretadores.pop();
                Number elementoDireita = new Number(Double.parseDouble(iterator.next()));

                Minus interpretador = new Minus(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Number(interpretador.interpretar()));
            }
            else {
                throw new IllegalArgumentException("Expressão com elemento inválido");
            }
        }
        interpretadorInicial = pilhaInterpretadores.pop();
    }

    @Override
    public double interpretar() {
        return interpretadorInicial.interpretar();
    }
}
