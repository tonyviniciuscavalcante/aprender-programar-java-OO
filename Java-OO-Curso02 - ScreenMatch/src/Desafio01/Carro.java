package Desafio01;

/*4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.*/

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFixaTecnica() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    void calculaIdadeCarro(int anoAtual) {
        int idadeCarro = anoAtual - ano;
        System.out.println("A idade do carro é: " + idadeCarro);
    }
}
