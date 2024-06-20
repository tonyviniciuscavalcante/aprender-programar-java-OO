package Desafio04.br.com.alura.exercicio05;

public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco, double desconto, double taxas) {
        double valorFinal = preco - (preco * desconto) - taxas;
        System.out.println("O valor final do produto é: R$" + valorFinal);
        return valorFinal;
    }
}
