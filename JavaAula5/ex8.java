import java.util.Scanner;

/*  Escreva um programa que leia o valor da compra e o valor pago pelo cliente. O
programa deve calcular e apresentar, o valor da compra, o valor pago pelo cliente, o valor
do troco e a quantidade de notas que deve ser dada de cada tipo para formar este troco.
O troco deve ser dado de forma a minimizar a quantidade de notas distribuídas.
 */
public class ex8 {
    public static void main(String[] args) {
        final int NOTA_100 = 100;
        final int NOTA_50 = 50;
        final int NOTA_20 = 20;
        final int NOTA_10 = 10;
        final int NOTA_5 = 5;
        final int NOTA_2 = 2;
        final int NOTA_1 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        int valorC = scanner.nextInt();
        System.out.print("Digite o valor pago pelo cliente: ");
        int valorP = scanner.nextInt();
        int troco = valorP - valorC;
        System.out.println("\nValores:");
        System.out.println("Valor da compra: R$ " + valorC);
        System.out.println("Valor pago pelo cliente: R$ " + valorP);
        System.out.println("Troco: R$ " + troco);
        System.out.println("\nQuantidade mínima de notas:");
        int quantidadeNotas100 = troco / NOTA_100;
        troco %= NOTA_100;
        int quantidadeNotas50 = troco / NOTA_50;
        troco %= NOTA_50;
        int quantidadeNotas20 = troco / NOTA_20;
        troco %= NOTA_20;
        int quantidadeNotas10 = troco / NOTA_10;
        troco %= NOTA_10;
        int quantidadeNotas5 = troco / NOTA_5;
        troco %= NOTA_5;
        int quantidadeNotas2 = troco / NOTA_2;
        troco %= NOTA_2;
        int quantidadeNotas1 = troco / NOTA_1;
        troco %= NOTA_1;
        System.out.println("Notas de R$ 100: " + quantidadeNotas100);
        System.out.println("Notas de R$ 50: " + quantidadeNotas50);
        System.out.println("Notas de R$ 20: " + quantidadeNotas20);
        System.out.println("Notas de R$ 10: " + quantidadeNotas10);
        System.out.println("Notas de R$ 5: " + quantidadeNotas5);
        System.out.println("Notas de R$ 2: " + quantidadeNotas2);
        System.out.println("Notas de R$ 1: " + quantidadeNotas1);
        scanner.close();
    }
}
