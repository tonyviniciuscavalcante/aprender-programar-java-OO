package DesafioFinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema bancário do Tony's.bank");
        String nome = "Tony Vinicius";
        String tipoConta = "Corrente";
        double saldo = 2500;
        String print;
        print = """
                ===============================
                Nome: %s
                Tipo da conta: %s
                Saldo inicial: R$ %f
                ===============================
                """.formatted(nome, tipoConta, saldo);
        System.out.println(print);

        String menu;
        menu= """
              Operações
                              
              1- Consultar saldos
              2- Receber valor
              3- Transferir valor
              4- Sair
              """;
        System.out.println(menu);

        int opcao = 0;

        while (opcao != 4) {
            System.out.print("Digite a opção que deseja: ");
            Scanner leitura = new Scanner(System.in);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo da sua conta é R$ " + saldo);
                System.out.println("===================================");
                System.out.println(menu);

            } else if (opcao == 2) {
                System.out.print("Digite o valor a ser depositado: R$ ");
                double case2 = leitura.nextDouble();
                saldo = saldo + case2;
                System.out.println("O seu saldo atual é: R$ " + saldo);
                System.out.println("===================================");
                System.out.println(menu);

            } else if (opcao == 3) {
                System.out.print("Digite o valor que deseja transferir: R$ ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                    System.out.println("===================================");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: R$ " + saldo);
                    System.out.println("===================================");
                }
                System.out.println(menu);
            } else if (opcao > 4 || opcao < 1) {
                System.out.println("Opção inválida, digite uma opção de 1 à 4");
                System.out.println("===================================");
                System.out.println(menu);
            }
        }

        System.out.println("Finalizando suas operações ;)");
    }
}
