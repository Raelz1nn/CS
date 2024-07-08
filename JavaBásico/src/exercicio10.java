import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário que digite a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaC = scanner.nextDouble();
        // Calcula a temperatura em Fahrenheit usando a fórmula
        double temperaturaF = (9 * temperaturaC + 160) / 5;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaF);
        scanner.close();
    }
}
