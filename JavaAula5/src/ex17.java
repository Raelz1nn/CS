import java.util.Scanner;

/* Faça um programa que leia o dia, o mês e o ano de nascimento de uma pessoa e o
dia, mês e ano atual. Em seguida, o programa deve calcular e apresentar quantos dias a
pessoa já viveu (considere que todos os meses têm 30 dias e, por consequência, cada
ano tem 360 dias).
 */
public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da data de nascimento
        System.out.println("Informe a data de nascimento:");
        System.out.print("Dia: ");
        int diaNascimento = scanner.nextInt();
        System.out.print("Mês: ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Ano: ");
        int anoNascimento = scanner.nextInt();

        // Leitura da data atual
        System.out.println("\nInforme a data atual:");
        System.out.print("Dia: ");
        int diaAtual = scanner.nextInt();
        System.out.print("Mês: ");
        int mesAtual = scanner.nextInt();
        System.out.print("Ano: ");
        int anoAtual = scanner.nextInt();

        // Cálculo da idade em anos
        int idadeAnos = anoAtual - anoNascimento;
        idadeAnos -= (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) ? 1 : 0;

        // Cálculo dos dias vividos
        int diasVividos = idadeAnos * 360; // 1 ano tem 360 dias
        diasVividos += (mesAtual - mesNascimento) * 30; // cada mês tem 30 dias
        diasVividos += (diaAtual - diaNascimento);

        // Exibição do resultado
        System.out.println("\nDias vividos até hoje: " + diasVividos);

        scanner.close();
    }
}
