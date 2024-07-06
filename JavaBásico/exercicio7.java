import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário que insira um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        // Calcula o quadrado do número
        double quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        scanner.close();
    }
}
