package src;

import java.util.Scanner;

/* ) Faça um programa que leia um número inteiro positivo (N), calcule e apresente o valor
de A, que é dado pela seguinte fórmula:
 */
public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar que o usuário insira um número inteiro positivo N
        System.out.print("Digite um número inteiro positivo N: ");
        int N = input.nextInt();

        // Variável para armazenar o valor de A
        double A = 0.0;

        // Calcular o valor de A conforme a fórmula dada
        for (int i = 1; i <= N; i++) {
            A += 1.0 / i;
        }

        // Apresentar o resultado
        System.out.printf("O valor de A para N = %d é %.2f\n", N, A);

        // Fechar o Scanner
        input.close();
    }
}
