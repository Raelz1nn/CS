import java.util.Scanner;

/* ) Considere que o último concurso vestibular apresentou três provas: Português,
Matemática e Conhecimentos Gerais. Para cada candidato tem-se um registro
contendo o seu nome e as notas obtidas em cada uma das provas. Construa um
programa que leia estes dados e apresente: 
a) o nome e as notas em cada prova do candidato.


 */
public class ex13a {
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
        System.out.println("\nDados do Candidato:");
        System.out.println("Nome: " + nome);
        System.out.println("Nota de Português: " + notaPort);
        System.out.println("Nota de Matemática: " + notaMat);
        System.out.println("Nota de Conhecimentos Gerais: " + notaConhe);
        scanner.close();
    }
}
