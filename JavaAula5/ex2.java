import java.util.Scanner;

/* Crie uma nova versão do programa da questão 2 para que ele mostre uma mensagem
indicando se a residência está com consumo elevado de energia. A empresa considera
consumo elevado de energia, se a residência consumir mais de de 70 quilowatts.
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do quilowatt de energia (R$): ");
        double precoQ = scanner.nextDouble();
        System.out.print("Digite a quantidade de quilowatts consumidos: ");
        double quantidadeQ = scanner.nextDouble();
        // Calcula o valor da conta se paga em dia
        double valorConta = precoQ * quantidadeQ;
        // Calcula o valor da conta se paga em atraso (com acréscimo de 10%)
        double valorContaA = valorConta * 1.10;
        // Verifica se o consumo é elevado (maior que 70 quilowatts)
        double excessoQuilowatts = quantidadeQ - 70;
        double consumoElevado = Math.max(0, excessoQuilowatts);
        System.out.println("\nValor a ser pago se a conta for paga em dia: R$" + valorConta);
        System.out.println("Valor a ser pago se a conta for paga em atraso: R$" + valorContaA);
        System.out.print("Consumo de energia está ");
        System.out.print(consumoElevado > 0 ? "elevado." : "dentro da média.");
        scanner.close();
    }
}
