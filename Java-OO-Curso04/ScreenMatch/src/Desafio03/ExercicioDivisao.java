package Desafio03;

/*1. Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.*/

import java.util.Scanner;

public class ExercicioDivisao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe o número para numerador: ");
        int numerador = leitura.nextInt();

        System.out.print("Informe o número para denomidador: ");
        int denominador = leitura.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida!");
        }
    }
}
