import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê o nome digitado pelo usuário
        System.out.print("Digite seu endereço: "); // Solicita ao usuário que insira seu endereço
        String endereco = scanner.nextLine(); // Lê o endereço digitado pelo usuário
        System.out.print("Digite seu telefone: ");// Solicita ao usuário que insira seu telefone
        String telefone = scanner.nextLine(); // Lê o telefone digitado pelo usuário

        // Imprime os dados na tela
        System.out.println("\nDados inseridos:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        scanner.close();
    }
}
