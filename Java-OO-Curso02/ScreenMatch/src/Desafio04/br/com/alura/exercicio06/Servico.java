package Desafio04.br.com.alura.exercicio06;

public class Servico implements Vendavel{
    @Override
    public double calculaPrecoTotal(double valor, int quantidadeComprada, double descontos) {
        double precoInicial = valor * quantidadeComprada;
        if (quantidadeComprada >= 5) {
            double precoFinal = precoInicial - (precoInicial * (descontos * 2));
            System.out.println("Comprando " + quantidadeComprada + " produtos no valor de R$ " + valor + " daremos o desconto de "
                    + descontos * 200 + "% ficando no total de: R$" + precoFinal);
        } else if (quantidadeComprada == 3 || quantidadeComprada == 4) {
            double precoFinal = precoInicial - (precoInicial * (descontos * 1.5));
            System.out.println("Comprando " + quantidadeComprada + " produtos no valor de R$ " + valor + " daremos o desconto de "
                    + descontos * 150 + "% ficando no total de: R$" + precoFinal);
        } else {
            double precoFinal = precoInicial - (precoInicial * descontos);
            System.out.println("Comprando " + quantidadeComprada + " produtos no valor de R$ " + valor + " daremos o desconto de "
                    + descontos * 100 + "% ficando no total de: R$" + precoFinal);
        }
        return precoInicial;
    }
}
