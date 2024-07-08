package src;

import java.util.Scanner;

/* A série de RICCI difere da série de FIBONACCI porque os dois primeiros termos são
fornecidos pelo usuário. Os demais termos são gerados da mesma forma que a série de
FIBONACCI. Crie um algoritmo que leia o primeiro termo, o segundo termo e a
quantidade de termos que deve ser apresentada (n). O programa deve calcular e imprimir
os n primeiros termos da série de RICCI e a soma dos termos impressos, sabendo-se que
para existir esta série serão necessários pelo menos três termos. Caso o usuário digite
um valor menor do que três para n, o programa deve solicitar que ele digite o valor
novamente */
public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Leitura dos primeiros dois termos e quantidade de termos desejados
            System.out.print("Digite o primeiro termo da série de RICCI: ");
            int primeiroTermo = scanner.nextInt();

            System.out.print("Digite o segundo termo da série de RICCI: ");
            int segundoTermo = scanner.nextInt();

            System.out.print("Digite a quantidade de termos a serem apresentados (n): ");
            int n = scanner.nextInt();

            // Verificação se n é maior ou igual a 3
            if (n < 3) {
                System.out.println("Para existir uma série de RICCI, n deve ser pelo menos 3. Tente novamente.");
                continue; // Reinicia o loop para pedir os dados novamente
            }

            // Array para armazenar os termos da série de RICCI
            int[] ricci = new int[n];

            // Atribuição dos dois primeiros termos fornecidos pelo usuário
            ricci[0] = primeiroTermo;
            ricci[1] = segundoTermo;

            // Cálculo e armazenamento dos demais termos da série de RICCI
            for (int i = 2; i < n; i++) {
                ricci[i] = ricci[i - 1] + ricci[i - 2];
            }

            // Impressão dos termos da série de RICCI
            System.out.println("\nSérie de RICCI:");
            for (int i = 0; i < n; i++) {
                System.out.print(ricci[i] + " ");
            }
            System.out.println(); // Pula uma linha

            // Cálculo da soma dos termos da série de RICCI
            int soma = 0;
            for (int i = 0; i < n; i++) {
                soma += ricci[i];
            }

            // Impressão da soma dos termos
            System.out.println("Soma dos termos da série de RICCI: " + soma);

            // Pergunta se deseja continuar
            System.out.print("\nDeseja calcular outra série de RICCI? (S/N): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break; // Encerra o programa se a resposta não for "S"
            }
        }

        scanner.close();
    }
}
