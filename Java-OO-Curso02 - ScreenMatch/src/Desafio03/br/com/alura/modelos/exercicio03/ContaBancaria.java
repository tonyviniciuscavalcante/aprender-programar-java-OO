package Desafio03.br.com.alura.modelos.exercicio03;

/*3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.*/

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito feito de R$ " + valor + ", ficando com saldo R$ " + saldo);;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual R$ : " + saldo);
        } else {
            System.out.println("Valor solicitado maior do que o saldo!");
        }
    }

    public void consultarSaldo() {
        System.out.println("O saldo da conta é: R$ " + saldo);
    }
}
