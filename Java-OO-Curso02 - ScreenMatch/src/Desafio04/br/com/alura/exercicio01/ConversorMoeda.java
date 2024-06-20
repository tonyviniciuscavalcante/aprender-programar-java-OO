package Desafio04.br.com.alura.exercicio01;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valorDolar) {
        double cotaDolar = 4.80;
        double valorReal = valorDolar  * cotaDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
        return cotaDolar;
    }
}
