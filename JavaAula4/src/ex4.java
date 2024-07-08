import java.util.Scanner;

//Escreva um programa que leia a temperatura em graus Celsius e apresente a temperatura correspondente em graus Fahrenheit, usando a fórmula abaixo.
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaC = scanner.nextDouble();
        double temperaturaF = (9.0 / 5.0) * temperaturaC + 32;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaF);
        scanner.close();
    }
}
