import java.util.Scanner;

//Faça um programa que leia dois números, calcule e apresente a soma dos quadradosdestes números
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        // Calcula o quadrado de cada número
        double quadrado1 = numero1 * numero1;
        double quadrado2 = numero2 * numero2;
        // Calcula a soma dos quadrados
        double soma = quadrado1 + quadrado2;
        System.out.println("A soma dos quadrados de " + numero1 + " e " + numero2 + " é: " + soma);
        scanner.close();
    }
}
