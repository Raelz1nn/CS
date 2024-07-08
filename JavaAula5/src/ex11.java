import java.util.Scanner;

/* ) Faça um programa que leia dois números A e B e mostre se eles são iguais.
 */
public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número A: ");
        double A = scanner.nextDouble();
        System.out.print("Digite o número B: ");
        double B = scanner.nextDouble();
        boolean saoIguais = (A == B);
        System.out.println("\nResultados:");
        System.out.printf("Os números A = %.2f e B = %.2f são iguais? %b", A, B, saoIguais);
        scanner.close();
    }
}
