import java.util.Scanner;

/* Crie uma nova o programa da questão 5, para que ele considere a frequência do aluno.
Agora, para ser aprovado o aluno precisa ter nota igual ou superior a sete no trabalho,
nota igual ou superior a seis em pelo menos uma das provas e frequência igual ou
superior a 75%. Além desta diferença, caso o aluno tenha nota seis no trabalho ele
poderá ser aprovado, mas para isto precisa ter frequência igual ou superior a 90%.
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da primeira prova: ");
        double P1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double P2 = scanner.nextDouble();
        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();
        System.out.print("Digite a frequência do aluno (%): ");
        double frequencia = scanner.nextDouble();
        boolean aprovado = notaTrabalho >= 7 && frequencia >= 75 ||
                notaTrabalho >= 6 && (P1 >= 6 || P2 >= 6) && frequencia >= 90;
        System.out.println("\nO aluno está " + (aprovado ? "aprovado" : "reprovado"));
        scanner.close();
    }
}
