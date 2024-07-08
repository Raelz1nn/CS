package src;

import java.util.Scanner;

/* Uma empresa dará um aumento de salário aos seus funcionários de acordo com a
categoria de cada empregado. O aumento seguirá a seguinte regra:
• Funcionários da categoria A ganharão 10% de aumento sobre o salário;
• Funcionários da categoria B ganharão 12% de aumento sobre o salário;
• Funcionários da categoria C ganharão 14% de aumento sobre o salário;
• Funcionários da categoria D ganharão 16% de aumento sobre o salário;
• Funcionários da categoria E ganharão 18% de aumento sobre o salário;
• Funcionários da categoria F ganharão 20% de aumento sobre o salário;
• Funcionários da categoria G ganharão 22% de aumento sobre o salário;
• Funcionários da categoria H ganharão 24% de aumento sobre o salário;
• Funcionários da categoria I ganharão 26% de aumento sobre o salário;
• Funcionários da categoria J ganharão 28% de aumento sobre o salário;


• Funcionários das demais categorias ganharão 30% de aumento sobre o salário */
public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura do número de funcionários
        System.out.print("Digite o número de funcionários: ");
        int numFuncionarios = input.nextInt();

        input.nextLine(); // Limpar o buffer de entrada

        // Arrays para armazenar os dados dos funcionários
        String[] nomes = new String[numFuncionarios];
        char[] categorias = new char[numFuncionarios];
        double[] salarios = new double[numFuncionarios];

        // Leitura dos dados de cada funcionário
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("\nFuncionário " + (i + 1) + ":");

            // Leitura do nome
            System.out.print("Nome: ");
            nomes[i] = input.nextLine();

            // Leitura da categoria
            System.out.print("Categoria (A-J ou outra): ");
            categorias[i] = input.next().charAt(0);

            // Leitura do salário atual
            System.out.print("Salário atual: R$ ");
            salarios[i] = input.nextDouble();

            // Chamar função para calcular o salário reajustado
            double salarioReajustado = calcularSalarioReajustado(categorias[i], salarios[i]);

            // Imprimir resultado
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Categoria: " + categorias[i]);
            System.out.println("Salário reajustado: R$ " + salarioReajustado);

            input.nextLine(); // Limpar o buffer de entrada
        }

        input.close();
    }

    // Função para calcular o salário reajustado de acordo com a categoria
    public static double calcularSalarioReajustado(char categoria, double salarioAtual) {
        double salarioReajustado = 0;

        switch (categoria) {
            case 'A':
                salarioReajustado = salarioAtual * 1.10; // 10% de aumento
                break;
            case 'B':
                salarioReajustado = salarioAtual * 1.12; // 12% de aumento
                break;
            case 'C':
                salarioReajustado = salarioAtual * 1.14; // 14% de aumento
                break;
            case 'D':
                salarioReajustado = salarioAtual * 1.16; // 16% de aumento
                break;
            case 'E':
                salarioReajustado = salarioAtual * 1.18; // 18% de aumento
                break;
            case 'F':
                salarioReajustado = salarioAtual * 1.20; // 20% de aumento
                break;
            case 'G':
                salarioReajustado = salarioAtual * 1.22; // 22% de aumento
                break;
            case 'H':
                salarioReajustado = salarioAtual * 1.24; // 24% de aumento
                break;
            case 'I':
                salarioReajustado = salarioAtual * 1.26; // 26% de aumento
                break;
            case 'J':
                salarioReajustado = salarioAtual * 1.28; // 28% de aumento
                break;
            default:
                salarioReajustado = salarioAtual * 1.30; // 30% de aumento para outras categorias
                break;
        }

        return salarioReajustado;
    }
}
