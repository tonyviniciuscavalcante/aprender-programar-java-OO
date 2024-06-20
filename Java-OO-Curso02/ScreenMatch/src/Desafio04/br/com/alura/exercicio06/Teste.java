package Desafio04.br.com.alura.exercicio06;

/*6. Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos.
Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.*/

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.calculaPrecoTotal(30,5,0.1);

        Servico servico = new Servico();
        servico.calculaPrecoTotal(30,6,0.1);
        servico.calculaPrecoTotal(30,3,0.1);
        servico.calculaPrecoTotal(30,1,0.1);
    }
}
