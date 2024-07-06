import java.util.Scanner;

/* Faça um programa que leia os valores A, B e C e informe se a soma de A com B é
menor ou igual a C.

 */
public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();
        boolean soma = (A + B <= C);
        System.out.println("\nResultado:");
        System.out.printf("A soma de A = %.2f e B = %.2f é menor ou igual a C = %.2f? %b\n", A, B, C, soma);
        scanner.close();
    }
}
