package src;

import java.util.Scanner;

/*  Uma empresa classifica seus funcionários em três níveis de acordo com um índice de
produtividade. São eles:
(1) Excelente
(2) Bom
(3) Regular.
Cada nível acrescenta um abono ao salário-base do funcionário, de acordo com a
seguinte tabela: 
Excelente - 80% do salário-base.
Bom - 50% do salário-base.
Regular 30% do salário-base.
 */
public class ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicitação do índice de produtividade
            System.out.print("Digite o índice de produtividade do funcionário (entre 0 e 100): ");
            int indice = scanner.nextInt();

            // Validação do índice
            if (indice < 0 || indice > 100) {
                System.out.println("Índice inválido. Por favor, digite um valor entre 0 e 100.");
                continue; // Reinicia o loop para pedir o índice novamente
            }

            // Classificação do funcionário
            String classificacao;
            double percentualAbono;
            if (indice >= 80 && indice <= 100) {
                classificacao = "Excelente";
                percentualAbono = 0.8; // 80% do salário-base
            } else if (indice >= 60 && indice < 80) {
                classificacao = "Bom";
                percentualAbono = 0.5; // 50% do salário-base
            } else {
                classificacao = "Regular";
                percentualAbono = 0.3; // 30% do salário-base
            }

            // Simulação do salário-base (pode ser lido do usuário ou de outro sistema)
            double salarioBase = 2500.00; // Exemplo de salário-base

            // Cálculo do abono
            double abono = percentualAbono * salarioBase;

            // Impressão da classificação e do abono
            System.out.println("O funcionário tem classificação: " + classificacao);
            System.out.printf("Abono a ser adicionado ao salário-base: R$ %.2f\n", abono);

            // Pergunta se deseja continuar
            System.out.print("\nDeseja classificar outro funcionário? (S/N): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break; // Encerra o programa se a resposta não for "S"
            }
        }

        scanner.close();
    }
}
