import java.util.Scanner;
//Crie um programa que leia as medidas da base e altura de um retângulo, calcule e apresente a área e o perímetro deste retângulo.

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        // Calcula a área do retângulo
        double area = base * altura;
        // Calcula o perímetro do retângulo
        double perimetro = 2 * (base + altura);
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
        scanner.close();
    }
}
