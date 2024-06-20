package Desafio04.br.com.alura.exercicio02;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public double calcularArea(double lado, double altura) {
        double areaCalculada = lado * altura;
        System.out.println("A área da sala retangular é: " + areaCalculada);
        return areaCalculada;
    }

    @Override
    public double calcularPerimetro(double lado, double altura) {
        double perimetroCalculado = 2 * (lado + altura);
        System.out.println("O perímetro da sala retangular é: " + perimetroCalculado);
        return perimetroCalculado;
    }
}
