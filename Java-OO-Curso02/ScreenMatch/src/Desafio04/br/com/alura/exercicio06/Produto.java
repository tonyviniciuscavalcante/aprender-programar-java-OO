package Desafio04.br.com.alura.exercicio06;

public class Produto implements Vendavel{
    @Override
    public double calculaPrecoTotal(double valor, int quantidadeComprada, double descontos) {
        double precoInicial = valor * quantidadeComprada;
        double precoFinal = precoInicial - (precoInicial * descontos);
        System.out.println("Comprando " + quantidadeComprada + " produtos no valor de R$ " + valor + " daremos o desconto de "
                + descontos * 100 + "% ficando no total de: R$" + precoFinal);
        return precoFinal;
    }
}
