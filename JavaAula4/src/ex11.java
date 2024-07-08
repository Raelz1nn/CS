import java.util.Scanner;

/*Um restaurante a quilo cobra R$39,00 por quilo de refeição. Escreva um programa
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Obs.
O prato vazio pesa 450 gramas.
 */
public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int h = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        int min = scanner.nextInt();
        System.out.print("Digite os segundos: ");
        int seg = scanner.nextInt();
        int totalS = h * 3600 + min * 60 + seg;
        System.out.println("\nTotal de segundos desde o início do dia: " + totalS);
        scanner.close();
    }
}
