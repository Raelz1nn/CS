import java.util.Scanner;

/* Uma sorveteria vende três tipos de picolés. Sabendo-se que o picolé tipo 1 é vendido
por R$ 1,50, o do tipo 2 por R$ 2,00 e o do tipo 3 por R$ 0,75, faça um programa que leia
a quantidade vendida de cada tipo de picolé e apresente o valor arrecadado com as
vendas de cada tipo de picolé e o valor total das vendas.
 */
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioM = scanner.nextDouble();
        double salarioF = 2 * salarioM;
        System.out.print("Digite a quantidade de carros vendidos no mês: ");
        int Carros = scanner.nextInt();
        System.out.print("Digite o valor total das vendas no mês: ");
        double valorV = scanner.nextDouble();
        double comissaoF = Carros * 150.0;
        double comissaoP = 0.05 * valorV;
        double salarioTotal = salarioF + comissaoF + comissaoP;
        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);
        scanner.close();
    }
}
