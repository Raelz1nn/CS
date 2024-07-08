import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        // Lê o número
        int numero = scanner.nextInt();
        // Calcula o sucessor e o antecessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("Número digitado: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
        scanner.close();
    }

}
