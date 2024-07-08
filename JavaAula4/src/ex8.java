import java.util.Scanner;

/* Uma pessoa foi ao supermercado e comprou:
Q quilos de café, cujo custo unitário é X;
L litros de leite, cujo custo unitário é Y;
B pacotes de bolacha, cujo custo unitário é Z.
Faça um programa que leia estes dados e imprima, para cada produto: nome do produto,
total gasto com ele. Além disto, ele deve apresentar o total gasto na compra.
 */
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        int quociente = num / 2;
        int resto = num % 2;
        System.out.println("Quociente da divisão por 2: " + quociente);
        System.out.println("Resto da divisão por 2: " + resto);
        scanner.close();
    }
}
