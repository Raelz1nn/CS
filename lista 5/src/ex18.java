package src;

import java.util.Scanner;

/* ) Uma empresa realizou uma pesquisa sobre a audiência de canal de TV em várias
casas de uma cidade. Para cada casa consultada foi informado o número do canal (4, 5, 7
ou 12) que estavam assistindo e o número de pessoas que estavam em frente a TV
naquele momento. Se a televisão estivesse desligada, nada era notado, ou seja, essa
casa não entrava na pesquisa. Faça um programa que leia um número indeterminado de
respostas (número do canal e número de pessoas que estavam assistindo), calcule e
mostre a porcentagem de audiência de cada canal. Para encerrar a entrada de dados,
digite o número do canal -1.
 */
public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização das variáveis para contagem de cada canal e total de casas
        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0, totalCasas = 0;

        System.out.println("Digite o número do canal (4, 5, 7 ou 12) e o número de pessoas assistindo:");
        System.out.println("Para encerrar, digite -1 como número do canal.");
        System.out.println("-------------------------------------------------------");

        // Leitura dos dados
        while (true) {
            System.out.print("Número do canal (ou -1 para encerrar): ");
            int numeroCanal = scanner.nextInt();

            if (numeroCanal == -1) {
                break; // Encerra o loop se o usuário digitar -1
            }

            System.out.print("Número de pessoas assistindo: ");
            int numPessoas = scanner.nextInt();

            // Verifica se o número do canal é válido (4, 5, 7 ou 12)
            if (numeroCanal == 4 || numeroCanal == 5 || numeroCanal == 7 || numeroCanal == 12) {
                // Incrementa o contador do canal correspondente
                switch (numeroCanal) {
                    case 4:
                        canal4 += numPessoas;
                        break;
                    case 5:
                        canal5 += numPessoas;
                        break;
                    case 7:
                        canal7 += numPessoas;
                        break;
                    case 12:
                        canal12 += numPessoas;
                        break;
                    default:
                        break;
                }
                totalCasas++; // Incrementa o total de casas que participaram da pesquisa
            } else {
                System.out.println("Número de canal inválido. Tente novamente.");
            }
        }

        // Calcula a porcentagem de audiência para cada canal
        double porcentagemCanal4 = (double) canal4 / totalCasas * 100;
        double porcentagemCanal5 = (double) canal5 / totalCasas * 100;
        double porcentagemCanal7 = (double) canal7 / totalCasas * 100;
        double porcentagemCanal12 = (double) canal12 / totalCasas * 100;

        // Exibe os resultados
        System.out.println("\nResultados da pesquisa de audiência:");
        System.out.printf("Canal 4: %.2f%%\n", porcentagemCanal4);
        System.out.printf("Canal 5: %.2f%%\n", porcentagemCanal5);
        System.out.printf("Canal 7: %.2f%%\n", porcentagemCanal7);
        System.out.printf("Canal 12: %.2f%%\n", porcentagemCanal12);

        scanner.close();
    }
}
