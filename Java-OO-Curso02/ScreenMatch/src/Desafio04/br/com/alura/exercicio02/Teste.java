package Desafio04.br.com.alura.exercicio02;

/*2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área
e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.*/

public class Teste {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular.calcularArea(4,6);
        calculadoraSalaRetangular.calcularPerimetro(4,6);
    }
}
