package Desafio04.br.com.alura.exercicio05;

public class Livro implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco, double desconto, double taxas) {
        double valorFinal = preco - (preco * desconto) - taxas;
        System.out.println("O valor final do livro é: R$" + valorFinal);
        return valorFinal;
    }
}
