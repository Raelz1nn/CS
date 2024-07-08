import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        double p1 = 1.50;
        double p2 = 2.00;
        double p3 = 0.75;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade vendida do picolé tipo 1: ");
        int quantidade1 = scanner.nextInt(); // Lê a quantidade vendida do tipo 1
        System.out.print("Digite a quantidade vendida do picolé tipo 2: ");
        int quantidade2 = scanner.nextInt(); // Lê a quantidade vendida do tipo 2
        System.out.print("Digite a quantidade vendida do picolé tipo 3: ");
        int quantidade3 = scanner.nextInt(); // Lê a quantidade vendida do tipo 3
        double valorP1 = quantidade1 * p1;
        double valorP2 = quantidade2 * p2;
        double valorP3 = quantidade3 * p3;
        double valorT = valorP1 + valorP2 + valorP3;
        System.out.println("Valor arrecadado com as vendas do picolé tipo 1: R$ " + valorP1);
        System.out.println("Valor arrecadado com as vendas do picolé tipo 2: R$ " + valorP2);
        System.out.println("Valor arrecadado com as vendas do picolé tipo 3: R$ " + valorP3);
        System.out.println("Valor total das vendas: R$ " + valorT);
        scanner.close();
    }
}
