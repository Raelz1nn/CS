package src;

import java.util.Scanner;

/* Melhore o programa da questão 7 para que ele não aceite que o usuário digite números
menores que 0. Quando isto acontecer, o programa deve solicitar que o usuário digite

novamente o valor e não deve considerar o número negativo nos cálculos.
 */
public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int somaNumeros = 0;
        double mediaNumeros = 0.0;
        int numero;

        System.out.println("Digite uma sequência de números inteiros positivos (digite 0 para encerrar):");

        // Leitura dos números até que seja digitado 0
        do {
            numero = lerNumeroPositivo(input);

            if (numero > 0) {
                quantidadeNumeros++;
                somaNumeros += numero;
            }

        } while (numero != 0);

        // Calcular a média apenas se a quantidade de números for maior que zero
        if (quantidadeNumeros > 0) {
            mediaNumeros = (double) somaNumeros / quantidadeNumeros;
        }

        // Exibir os resultados
        System.out.println("\nResultados:");
        System.out.println("Quantidade de números digitados (exceto 0): " + quantidadeNumeros);
        System.out.println("Soma de todos os números: " + somaNumeros);
        System.out.println("Média de todos os números: " + mediaNumeros);

        input.close();
    }

    // Função para ler um número inteiro positivo
    public static int lerNumeroPositivo(Scanner input) {
        int numero;

        do {
            System.out.print("Digite um número inteiro positivo (ou 0 para encerrar): ");
            numero = input.nextInt();

            if (numero < 0) {
                System.out.println("Número inválido! Digite novamente.");
            }
        } while (numero < 0);

        return numero;
    }

}
