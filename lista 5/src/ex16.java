package src;

import java.util.Scanner;

/* ) O seno de um ângulo A, expresso em radianos, pode ser calculado pela série abaixo:
Faça um programa que leia o valor do ângulo em graus, converta-o para radianos e
calcule o seu seno, utilizando os oito primeiros termos da série acima. */
public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor do ângulo em graus
        System.out.print("Digite o ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        // Converte o ângulo de graus para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);

        // Calcula o seno do ângulo usando os oito primeiros termos da série de Taylor
        double senoAngulo = 0.0;
        for (int i = 0; i < 8; i++) {
            double termo = Math.pow(-1, i) * Math.pow(anguloRadianos, 2 * i + 1) / fatorial(2 * i + 1);
            senoAngulo += termo;
        }

        // Exibe o resultado
        System.out.println("O seno de " + anguloGraus + " graus é aproximadamente: " + senoAngulo);

        scanner.close();
    }

    // Função para calcular o fatorial de um número inteiro
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
