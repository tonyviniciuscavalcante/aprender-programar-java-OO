package Exemplos;

import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        //
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.

                println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        //
        String nome1 = "João";
        int aulas = 4;

        String mensagem = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                """.formatted(nome1, aulas);

        System.out.
                println(mensagem);

        //
        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);

        //
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade1 = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor1 = scanner.nextDouble();

        System.out.println(nome2 + " que tem " + idade1 + " anos, irá investir R$ " + valor1 + " esse mês.");

        scanner.close();
    }
}
