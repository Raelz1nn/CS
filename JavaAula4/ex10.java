import java.util.Scanner;

/*(DESAFIO) Crie um programa que leia um número inteiro que representa a
quantidade de segundos de um vídeo. O programa deve calcular e apresentar quantas
horas, minutos e segundos dura este vídeo.
 */
public class ex10 {
    public static void main(String[] args) {
        final double PRECO = 39.00;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso do prato montado (em quilos): ");
        double peso = scanner.nextDouble();
        double pesoT = peso + 0.45;
        double valor = pesoT * PRECO;
        System.out.println("Valor a pagar: R$ " + valor);
        scanner.close();
    }
}