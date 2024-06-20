package Desafio03.br.com.alura.modelos.exercicio01;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setQuantidadePortas(2);
        meuCarro.definirModelo("Sedan");
        System.out.println("Modelo com: " + meuCarro.getQuantidadePortas() + " portas.");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}
