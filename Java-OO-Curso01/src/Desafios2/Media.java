package Desafios2;

public class Media {
    public static void main(String[] args) {

        /*Crie um programa que realize a média de duas notas decimais e exiba o resultado.*/
        double num1 = 8.3;
        double num2 = 9.1;
        String respostaMedia;

        double media = (num1 + num2) / 2;

        respostaMedia = """
                A média entre %f e %f é: %f
                """.formatted(num1, num2, media);

        System.out.println(respostaMedia);

        /*Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.*/
        double variavelDouble = 10.105;
        int variavelInteira = (int) variavelDouble;
        String casting;
        casting = """
                A variável tipo double %f sendo realizada para int através do casting é: %d
                """.formatted(variavelDouble, variavelInteira);

        System.out.println(casting);

        /*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.*/
        char letra = 'O';
        String palavra = "lá, você gostaria de um cafézin?";
        String mensagem = letra + palavra;

        System.out.println(mensagem);

        /*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e
        apresente o resultado em uma mensagem.*/
        double precoProduto = 105.99;
        int quantidade = 3;
        double resultado = precoProduto * quantidade;
        String mensagemFinal;
        mensagemFinal = """
                O preço do produto é %f e foi pego %d unidades
                Com isso, temos o total a ser pago de: R$%f
                """.formatted(precoProduto, quantidade, resultado);

        System.out.println(mensagemFinal);

        /*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/
        double valorEmDolares = 52.35;
        double valorEmReais = valorEmDolares * 4.94;

        String resultadoConvertido;
        resultadoConvertido = """
                O valor de R$%f dálres é equivalente a: R$%f reais.
                """.formatted(valorEmDolares, valorEmReais);
        System.out.println(resultadoConvertido);

        /*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida,
        Declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.*/
        double precoOriginal = 39.99;
        double percentualDesconto = 0.1;
        double precoComDesconto = precoOriginal * percentualDesconto;
        double valorComDesconto = precoOriginal - precoComDesconto;

        String resultadoComDesconto;
        resultadoComDesconto = """
                O produto com o preço R$%f com o desconto de %f fica: R$%f
                """.formatted(precoOriginal, precoComDesconto,valorComDesconto);

        System.out.println(resultadoComDesconto);
    }
}
