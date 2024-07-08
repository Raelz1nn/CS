import java.util.Scanner;

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
