package Desafio04.br.com.alura.exercicio03;

/*3. Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número.
A classe deve receber o número como parâmetro.*/

public class Teste {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(5);
        tabuada.mostrarTabuada(2);
        tabuada.mostrarTabuada(9);
    }
}
