package src;

import java.util.Scanner;

/* Faça um programa que leia um conjunto de números inteiros maiores que zero (quando
o usuário digitar 0 o programa deve ser encerrado), calcule e apresente:
- O maior número digitado;

- O menor número digitado.
 */
public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;
        int numero;

        System.out.println("Digite uma sequência de números inteiros positivos (digite 0 para encerrar):");

        // Leitura dos números até que seja digitado 0
        do {
            numero = lerNumeroPositivo(input);

            if (numero > 0) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }

        } while (numero != 0);

        // Exibir os resultados
        if (maiorNumero != Integer.MIN_VALUE) {
            System.out.println("\nMaior número digitado: " + maiorNumero);
        } else {
            System.out.println("\nNenhum número válido foi digitado.");
        }

        if (menorNumero != Integer.MAX_VALUE) {
            System.out.println("Menor número digitado: " + menorNumero);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

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
