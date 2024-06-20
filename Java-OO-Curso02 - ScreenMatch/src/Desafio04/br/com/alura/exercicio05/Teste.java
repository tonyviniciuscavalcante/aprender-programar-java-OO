package Desafio04.br.com.alura.exercicio05;

/*5. Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico,
cada uma retornando o preço final considerando descontos ou taxas adicionais.*/

public class Teste {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.calcularPrecoFinal(50,0.1,0);

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.calcularPrecoFinal(120,0.2,5.50);
    }
}
