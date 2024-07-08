import java.util.Scanner;

//Faça um programa que leia dois números, calcule e apresente o quadrado da soma destes números
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        double soma = n1 + n2;
        // Calcula o quadrado da soma
        double quadrado = soma * soma;
        System.out.println("O quadrado da soma de " + n1 + " e " + n2 + " é: " + quadrado);
        scanner.close();
    }
}
