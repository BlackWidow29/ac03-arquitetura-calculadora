package br.com.impacta.accalculadora;

public class Calculadora {
    Double calcular(Double valor1, Double valor2, String operador) {
        var fabrica = new OperacaoFabrica();
        var calculo = fabrica.criar(operador);

        if (calculo != null) {
            try {
                Double resultado = calculo.executar(valor1, valor2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0.0;
    }
}
