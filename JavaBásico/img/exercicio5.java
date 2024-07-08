import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de x: "); // Solicita ao usuário que insira o valor de x
        double x = scanner.nextDouble(); // Lê o valor de x
        double y = 3 * x + 2; // Calcula o valor de y

        System.out.println("O valor de y para x = " + x + " é: " + y);
        scanner.close();
    }
}
