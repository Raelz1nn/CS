import java.util.Scanner;

/*  Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
conta. O programa não deve perguntar se a conta será paga em atraso ou não, ele deve
sempre calcular e apresentar os dois valores, para que o usuário analise a diferença e
decida se vai pagar a conta em dia ou não.
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do quilowatt de energia (R$): ");
        double precoQt = scanner.nextDouble();
        System.out.print("Digite a quantidade de quilowatts consumidos: ");
        double quantidadeQ = scanner.nextDouble();
        double valorConta = precoQt * quantidadeQ;
        double valorContaA = valorConta * 1.10;
        scanner.close();
        System.out.println("Valor a ser pago se a conta for paga em dia: R$" + valorConta);
        System.out.println("Valor a ser pago se a conta for paga em atraso: R$" + valorContaA);
    }
}
