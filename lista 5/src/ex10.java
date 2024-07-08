package src;

import java.util.Scanner;

/* ) Faça um programa que funcione de forma semelhante a um menu. O programa deve
apresentar as opções abaixo na tela e solicitar que o usuário digite a opção desejada:
1 – Inclusão de cliente.
2 – Alteração de cliente.
3 – Exclusão de cliente.
4 – Visualização de cliente.
5 – Sair.
Quando o usuário digitar um valor entre 1 e 4, o programa deve apresentar uma
mensagem na tela com a função selecionada e apresentar o menu novamente. Se o
usuário digitar 5, o programa deve ser encerrado. Se o usuário digitar qualquer outro
valor, o p
rograma deve mostrar a mensagem "Opção inválida" e apresentar o menu
novamente. */
public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nOpção selecionada: Inclusão de cliente");
                    // Chamar método para inclusão de cliente
                    break;
                case 2:
                    System.out.println("\nOpção selecionada: Alteração de cliente");
                    // Chamar método para alteração de cliente
                    break;
                case 3:
                    System.out.println("\nOpção selecionada: Exclusão de cliente");
                    // Chamar método para exclusão de cliente
                    break;
                case 4:
                    System.out.println("\nOpção selecionada: Visualização de cliente");
                    // Chamar método para visualização de cliente
                    break;
                case 5:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Digite novamente.");
            }

        } while (opcao != 5);

        input.close();
    }

    public static void exibirMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1 – Inclusão de cliente");
        System.out.println("2 – Alteração de cliente");
        System.out.println("3 – Exclusão de cliente");
        System.out.println("4 – Visualização de cliente");
        System.out.println("5 – Sair");
        System.out.print("Escolha uma opção: ");
    }
}
