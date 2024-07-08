import java.util.Scanner;

/* uma informação dizendo se o candidato foi aprovado ou não. Considere que um
candidato é aprovado se sua média for maior que 7.0 e se não apresentou
nenhuma nota abaixo de 5.0
 */
public class ex13c {
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
        boolean aprovado = (media > 7.0) && (notaPort >= 5.0) && (notaMat >= 5.0) && (notaConhe >= 5.0);
        System.out.println("\nDados do Candidato:");
        System.out.println("Nome: " + nome);
        System.out.println("Nota de Português: " + notaPort);
        System.out.println("Nota de Matemática: " + notaMat);
        System.out.println("Nota de Conhecimentos Gerais: " + notaConhe);
        System.out.println("Média do Candidato: " + media);
        System.out.println("Situação: " + (aprovado ? "Aprovado" : "Reprovado"));
        scanner.close();
    }
}
