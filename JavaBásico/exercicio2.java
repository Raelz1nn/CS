import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        // ler o numero digitado
        int numero = scanner.nextInt();
        System.out.println("O número digitado foi: " + numero);
        scanner.close();
    }
}
