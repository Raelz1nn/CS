import java.util.Scanner;

/* Faça um programa que leia um número inteiro entre 0 e 999 e apresente a soma dos
seus dígitos. Por exemplo, se o número digitado por 284 o resultado será igual a 14
(2+8+4)
 */
public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 999: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero < 0 || numero > 999) {
            System.out.println("Número inválido. Digite um número entre 0 e 999.");
        } else {
            int soma = 0;

            while (numero != 0) {
                soma += numero % 10;
                numero /= 10;
            }

            System.out.println("A soma dos dígitos é: " + soma);
        }
    }
}
