/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

1. Para gerar um número aleatório em Java: new Random().nextInt(100);
2. Utilize o Scanner para obter os dados do usuário;
3. Utilize uma variável para contar as tentativas;
4. Utilize um loop para controlar as tentativas;
5. Utilize a instrução break; para interromper o loop.*/

package Desafios3;

import java.util.Random;
import java.util.Scanner;

public class JodoDeAdiviacao {
    public static void main(String[] args) {
        Scanner numLeitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número de 0 a 100: ");
            numeroDigitado = numLeitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acerto o número secreto em " + tentativas + "tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
            System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}
