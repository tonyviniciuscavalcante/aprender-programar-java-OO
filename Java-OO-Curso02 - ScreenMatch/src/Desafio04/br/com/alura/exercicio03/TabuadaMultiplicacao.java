package Desafio04.br.com.alura.exercicio03;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public int mostrarTabuada(int numero) {
        for (int i = 1; i < 11; i++) {
            int valor = numero * i;
            System.out.println(numero + " X " + i + " = " + valor);
        }
        return numero;
    }
}
