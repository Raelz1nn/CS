import java.util.Scanner;

/*  O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
igual ou superior a seis em pelo menos uma das provas. Observe que não se deve
calcular a média das notas. Faça um programa que leia as três notas do aluno e
apresente se ele deve ser aprovado ou não.
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da primeira prova: ");
        double P1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double P2 = scanner.nextDouble();
        System.out.print("Digite a nota do trabalho: ");
        double notaT = scanner.nextDouble();
        boolean aprovado = notaT >= 7 && (P1 >= 6 || P2 >= 6);
        System.out.println("\nO aluno está " + (aprovado ? "aprovado" : "reprovado"));
        scanner.close();
    }
}
