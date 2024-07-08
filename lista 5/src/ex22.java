package src;

import java.util.Scanner;

/*  Crie um algoritmo que controle o saldo bancário de um cliente. O algoritmo deve ler o
valor do saldo inicial e em seguida as operações realizadas na conta (código e valor da
operação). As operações podem ser as seguintes:
- Saque em dinheiro (código = 10);
- Depósito (código = 33);
- Pagamento com cartão (código = 4)
Ao ler as operações o algoritmo deve realizar as atualizações na conta, imprimindo uma
mensagem ao usuário com o saldo atual. Quando um pagamento é feito com cartão, uma
taxa de 1.5% é cobrada do cliente.
O algoritmo deve continuar a leitura até que o código de operação seja 0 (zero). Códigos
diferentes dos definidos devem ser ignorados e uma mensagem de erro apresentada. Ao
final do processamento o algoritmo deverá imprimir o saldo e um mensagem indicando se
o cliente está com saldo negativo ou não. */
public class ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do saldo inicial
        System.out.print("Digite o saldo inicial da conta: R$ ");
        double saldo = scanner.nextDouble();

        // Variável para armazenar o código da operação
        int codigoOperacao;
        // Variável para armazenar o valor da operação
        double valorOperacao;

        // Loop para ler e processar as operações até que o usuário deseje sair
        while (true) {
            // Menu de opções
            System.out.println("\nEscolha a operação:");
            System.out.println("10 - Saque em dinheiro");
            System.out.println("33 - Depósito");
            System.out.println("4 - Pagamento com cartão");
            System.out.println("0 - Encerrar e exibir saldo final");

            // Leitura do código da operação
            System.out.print("Digite o código da operação (ou 0 para encerrar): ");
            codigoOperacao = scanner.nextInt();

            // Verificação se o usuário deseja encerrar o programa
            if (codigoOperacao == 0) {
                break;
            }

            // Leitura do valor da operação
            System.out.print("Digite o valor da operação: R$ ");
            valorOperacao = scanner.nextDouble();

            // Processamento das operações
            switch (codigoOperacao) {
                case 10: // Saque em dinheiro
                    if (valorOperacao > saldo) {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    } else {
                        saldo -= valorOperacao;
                        System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valorOperacao);
                    }
                    break;
                case 33: // Depósito
                    saldo += valorOperacao;
                    System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valorOperacao);
                    break;
                case 4: // Pagamento com cartão
                    saldo -= valorOperacao;
                    System.out.printf("Pagamento com cartão de R$ %.2f realizado com sucesso.\n", valorOperacao);
                    break;
                default:
                    System.out.println("Código de operação inválido.");
                    break;
            }
        }

        // Exibição do saldo final
        System.out.printf("\nSaldo final da conta: R$ %.2f\n", saldo);

        scanner.close();
    }
}
