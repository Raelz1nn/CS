import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de quilos de café comprados: ");
        double kgCafe = scanner.nextDouble();
        System.out.print("Digite o custo unitário do café por quilo: R$ ");
        double custoC = scanner.nextDouble();
        System.out.print("Digite a quantidade de litros de leite comprados: ");
        double litros = scanner.nextDouble();
        System.out.print("Digite o custo unitário do leite por litro: R$ ");
        double custoL = scanner.nextDouble();
        System.out.print("Digite a quantidade de pacotes de bolacha comprados: ");
        int bolacha = scanner.nextInt();
        System.out.print("Digite o custo unitário da bolacha por pacote: R$ ");
        double custoB = scanner.nextDouble();
        double totalC = kgCafe * custoC;
        double totalL = litros * custoL;
        double totalB = bolacha * custoB;
        double totallC = totalC + totalL + totalB;
        System.out.println("\nTotal gasto com café: R$ " + totalC);
        System.out.println("Total gasto com leite: R$ " + totalL);
        System.out.println("Total gasto com bolacha: R$ " + totalB);
        System.out.println("\nTotal geral da compra: R$ " + totallC);
        scanner.close();
    }
}
