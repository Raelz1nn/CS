package src;

import java.util.Scanner;

/* A série de Fibinacci é formada pela sequência: 0, 1, 1, 2, 3, 5, 8, 13 ...
Crie um programa que leia um número inteiro N (entre 3 e 20) e apresente a série de
Fibonacci até o enésimo termo. Se o número digitado pelo usuário não estiver entre o
intervalo 3 e 20 (inclusive), o programa deve solicitar que ele digite outro número.
 */
public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        do {
            System.out.print("Digite um número inteiro entre 3 e 20 para a série de Fibonacci: ");
            N = input.nextInt();

            if (N < 3 || N > 20) {
                System.out.println("Número fora do intervalo permitido. Tente novamente.");
            }
        } while (N < 3 || N > 20);

        // Array para armazenar os termos da sequência de Fibonacci até o N-ésimo termo
        int[] fibonacci = new int[N];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calculando e exibindo a série de Fibonacci até o N-ésimo termo
        System.out.println("\nSérie de Fibonacci até o " + N + "º termo:");
        System.out.print(fibonacci[0] + ", " + fibonacci[1]);

        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(", " + fibonacci[i]);
        }

        input.close();
    }
}
