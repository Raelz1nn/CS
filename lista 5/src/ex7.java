package src;

import java.util.Scanner;

/* ) Faça um programa que leia um conjunto de números inteiros maiores que zero (quando
o usuário digitar 0 o programa deve ser encerrado), calcule e apresente:
• Quantos números foram digitados (exceto o 0).
• A soma de todos os números.

• A média de todos os números. */
public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int somaNumeros = 0;
        double mediaNumeros = 0.0;
        int numero;

        System.out.println("Digite uma sequência de números inteiros (digite 0 para encerrar):");

        // Leitura dos números até que seja digitado 0
        do {
            numero = input.nextInt();

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
}
