import java.util.Scanner;

/* Faça um programa que leia o preço de três mercadorias no dia 01/01/2022 e o no dia
01/02/2022. Em seguida o programa deve calcular a inflação do período, considerando a
variação de preço dos três produtos. Mostre uma mensagem se a inflação está acima da
meta ou não (considere que a meta para o mês é de 0,55%)
 */
public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o preço da mercadoria 1 em 01/01/2022:");
        double p1Jan = scanner.nextDouble();
        System.out.println("Informe o preço da mercadoria 2 em 01/01/2022:");
        double p2Jan = scanner.nextDouble();
        System.out.println("Informe o preço da mercadoria 3 em 01/01/2022:");
        double p3Jan = scanner.nextDouble();
        System.out.println("Informe o preço da mercadoria 1 em 01/02/2022:");
        double p1Fev = scanner.nextDouble();
        System.out.println("Informe o preço da mercadoria 2 em 01/02/2022:");
        double p2Fev = scanner.nextDouble();
        System.out.println("Informe o preço da mercadoria 3 em 01/02/2022:");
        double p3Fev = scanner.nextDouble();
        double var1 = ((p1Fev - p1Jan) / p1Jan) * 100;
        double var2 = ((p2Fev - p2Jan) / p2Jan) * 100;
        double var3 = ((p3Fev - p3Jan) / p3Jan) * 100;
        double inflacao = (var1 + var2 + var3) / 3;
        boolean acima = inflacao > 0.55;
        int inflacaoAcima = (acima ? 1 : 0);
        System.out.printf("Variação da mercadoria 1: %.2f%%\n", var1);
        System.out.printf("Variação da mercadoria 2: %.2f%%\n", var2);
        System.out.printf("Variação da mercadoria 3: %.2f%%\n", var3);
        System.out.printf("Inflação média do período: %.2f%%\n", inflacao);
        System.out.println("A inflação está " + (inflacaoAcima == 1 ? "acima" : "dentro") + " da meta estipulada.");
        scanner.close();
    }
}
