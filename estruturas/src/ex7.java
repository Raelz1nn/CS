import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cpf;
        double rendaMensal;
        char classeRenda;
        double valorDesconto;
        double aliquota;

        do {
            // Leitura dos dados do contribuinte
            System.out.println("Digite o CPF do contribuinte (ou '00' para encerrar):");
            cpf = input.nextLine();

            if (cpf.equals("00")) {
                break;
            }

            System.out.println("Digite a renda mensal do contribuinte:");
            rendaMensal = input.nextDouble();
            input.nextLine(); // Limpar o buffer do Scanner

            System.out.println("Digite a classe de renda do contribuinte (A, B, C, D ou E):");
            classeRenda = input.next().toUpperCase().charAt(0);
            input.nextLine(); // Limpar o buffer do Scanner

            // Cálculo do imposto de renda
            switch (classeRenda) {
                case 'A':
                    aliquota = 0; // Isento
                    valorDesconto = 0;
                    break;
                case 'B':
                    aliquota = 0.05; // 5%
                    valorDesconto = rendaMensal * aliquota;
                    break;
                case 'C':
                    aliquota = 0.10; // 10%
                    valorDesconto = rendaMensal * aliquota;
                    break;
                case 'D':
                    aliquota = 0.15; // 15%
                    valorDesconto = rendaMensal * aliquota;
                    break;
                case 'E':
                    aliquota = 0.20; // 20%
                    valorDesconto = rendaMensal * aliquota;
                    break;
                default:
                    System.out.println("Classe de renda inválida. Informe A, B, C, D ou E.");
                    continue; // Reinicia o loop para digitar novamente os dados
            }

            // Exibição dos resultados
            System.out.println("Alíquota de desconto aplicada: " + (aliquota * 100) + "%");
            System.out.printf("Valor descontado: R$ %.2f\n", valorDesconto);

        } while (!cpf.equals("00"));

        System.out.println("Programa encerrado.");
        input.close();
    }

}
