import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro (maior que o primeiro):");
        int num2 = sc.nextInt();

        // Verifica se o segundo número é maior que o primeiro
        while (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro. Digite novamente:");
            num2 = sc.nextInt();
        }

        // Calcula a soma dos dois números
        int soma = num1 + num2;

        // Exibe o resultado da soma
        System.out.println("A soma dos números " + num1 + " e " + num2 + " é: " + soma);

        sc.close();
    }
}
