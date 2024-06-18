package Desafios3;

import java.util.Scanner;

public class Laços {
    public static void main(String[] args) {

        /* 1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/

        Scanner numLeitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = numLeitura.nextInt();

        if (numero > 0) {
            System.out.println("Você digitou um número maior que zero");
        } else if (numero < 0) {
            System.out.println("Você digitou um número negativo..");
        } else {
            System.out.println("Você digitou o número zero");
        }
        System.out.println("===========================================");

        /* 2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior
                ou o segundo é maior.*/

        Scanner num1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        int numero2 = num2.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior do que o número " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("O número " + numero1 + " é menor do que o número " + numero2);
        } else {
            System.out.println("Os dois números são iguais");
        }

        /* 3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário
            e realize o cálculo da área com base na opção selecionada. */

        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        /* 4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. */

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero3 = scanner1.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero3 + " x " + i + " = " + (numero3 * i));
        }


        /* 5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente. */

        Scanner scanner7 = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero7 = scanner7.nextInt();

        if (numero7 % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        /* 6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/

        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero5 = scanner3.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero5; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero5 + " é: " + fatorial);
    }
}
