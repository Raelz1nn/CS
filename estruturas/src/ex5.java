import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeHospede;
        char tipoApartamento;
        int numDiarias;
        double valorDiaria = 0;
        double totalPagar;
        char continua;

        do {
            // Leitura dos dados do hóspede
            System.out.println("Digite o nome do hóspede:");
            nomeHospede = input.nextLine();

            // Leitura do tipo de apartamento e validação
            do {
                System.out.println("Digite o tipo do apartamento (A, B ou C):");
                tipoApartamento = input.next().toUpperCase().charAt(0);
                if (tipoApartamento != 'A' && tipoApartamento != 'B' && tipoApartamento != 'C') {
                    System.out.println("Tipo de apartamento inválido. Digite A, B ou C.");
                }
            } while (tipoApartamento != 'A' && tipoApartamento != 'B' && tipoApartamento != 'C');

            // Leitura do número de diárias e validação
            do {
                System.out.println("Digite o número de diárias (maior que zero):");
                numDiarias = input.nextInt();
                if (numDiarias <= 0) {
                    System.out.println("Número de diárias inválido. Digite um número maior que zero.");
                }
            } while (numDiarias <= 0);

            // Cálculo do valor total a pagar
            switch (tipoApartamento) {
                case 'A':
                    valorDiaria = 150.00;
                    break;
                case 'B':
                    valorDiaria = 100.00;
                    break;
                case 'C':
                    valorDiaria = 75.00;
                    break;
            }
            totalPagar = valorDiaria * numDiarias;

            // Exibição da conta final
            System.out.println("\nConta Final:");
            System.out.println("Nome do hóspede: " + nomeHospede);
            System.out.println("Tipo do apartamento: " + tipoApartamento);
            System.out.printf("Valor total das diárias: R$ %.2f\n", totalPagar);

            // Pergunta se deseja continuar
            System.out.println("\nDeseja cadastrar outro hóspede? (S/N)");
            continua = input.next().toUpperCase().charAt(0);
            input.nextLine(); // Limpa o buffer do Scanner

            System.out.println(); // Linha em branco para separação entre cadastros

        } while (continua == 'S');

        input.close();
        System.out.println("Programa encerrado.");
    }
}
