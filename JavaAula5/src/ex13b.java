import java.util.Scanner;

/* b) a média do candidato.
 */
public class ex13b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do candidato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a nota de Português: ");
        double notaPort = scanner.nextDouble();
        System.out.print("Digite a nota de Matemática: ");
        double notaMat = scanner.nextDouble();
        System.out.print("Digite a nota de Conhecimentos Gerais: ");
        double notaConhe = scanner.nextDouble();
        double media = (notaPort + notaMat + notaConhe) / 3;
        System.out.println("\nDados do Candidato:");
        System.out.println("Nome: " + nome);
        System.out.println("Nota de Português: " + notaPort);
        System.out.println("Nota de Matemática: " + notaMat);
        System.out.println("Nota de Conhecimentos Gerais: " + notaConhe);
        System.out.println("Média do Candidato: " + media);
        scanner.close();
    }
}
