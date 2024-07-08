import java.util.Scanner;

/* Faça um programa que leia a quantidade total de parcelas de um consórcio, a
quantidade de parcelas já pagas e o valor de cada parcela (considere que todas as
parcelas tem o mesmo valor). O programa deve calcular e apresentar o total já pago pelo
cliente e qual é o seu saldo devedor.
 */
public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade total de parcelas: ");
        int totalP = scanner.nextInt();
        System.out.print("Quantidade de parcelas pagas: ");
        int parcelasP = scanner.nextInt();
        System.out.print("Valor de cada parcela: ");
        double valorP = scanner.nextDouble();
        double totalPg = parcelasP * valorP;
        double saldo = (totalPg - parcelasP) * valorP;
        System.out.printf("Total já pago: R$ %.2f\n", totalP);
        System.out.printf("Saldo devedor: R$ %.2f\n", saldo);
        scanner.close();
    }
}
