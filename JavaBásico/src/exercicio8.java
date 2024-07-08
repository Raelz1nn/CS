import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário que digite os quatro números
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();
        System.out.print("Digite o quarto número: ");
        double n4 = scanner.nextDouble();
        // Calcula o quadrado
        double quadrado1 = n1 * n1;
        double quadrado2 = n2 * n2;
        double quadrado3 = n3 * n3;
        double quadrado4 = n4 * n4;
        // Soma dos quadrados
        double soma = quadrado1 + quadrado2 + quadrado3 + quadrado4;
        System.out.println("A soma dos quadrados dos números é: " + soma);
        scanner.close();
    }
}
