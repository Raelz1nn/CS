package src;

import java.util.Scanner;

/* Crie um algoritmo que imprima a tabela de conversão de graus Celsius para
Fahrenheit para o intervalo desejado pelo usuário. O algoritmo deve solicitar ao usuário o
limite inferior do intervalo, o limite superior do intervalo e o incremento. */
public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos limites do intervalo e do incremento
        System.out.print("Digite o limite inferior do intervalo (em Celsius): ");
        double limiteInferior = scanner.nextDouble();

        System.out.print("Digite o limite superior do intervalo (em Celsius): ");
        double limiteSuperior = scanner.nextDouble();

        System.out.print("Digite o incremento (em Celsius): ");
        double incremento = scanner.nextDouble();

        // Cabeçalho da tabela
        System.out.println("\nTabela de Conversão de Celsius para Fahrenheit");
        System.out.println("-------------------------------------------");
        System.out.println("Celsius\t|\tFahrenheit");
        System.out.println("-------------------------------------------");

        // Loop para calcular e exibir a tabela
        for (double celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            // Fórmula de conversão
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.printf("%.2f\t|\t%.2f\n", celsius, fahrenheit);
        }

        scanner.close();
    }
}
