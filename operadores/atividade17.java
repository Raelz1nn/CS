/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;
import java.util.Scanner;
public class atividade17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade total de parcelas do consórcio:");
        int totalParcelas = scanner.nextInt();

        System.out.println("Informe a quantidade de parcelas já pagas:");
        int parcelasPagas = scanner.nextInt();

        System.out.println("Informe o valor de cada parcela:");
        double valorParcela = scanner.nextDouble();

        double totalPago = parcelasPagas * valorParcela;
        double saldoDevedor = (totalParcelas - parcelasPagas) * valorParcela;

        System.out.println("Total já pago pelo cliente: R$" + totalPago);
        System.out.println("Saldo devedor: R$" + saldoDevedor);

        scanner.close();
    }
    
}
