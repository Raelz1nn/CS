import java.util.Scanner;

/* Faça um programa leia o salário bruto e o número de dependentes de um funcionário
e calcule o seu salário líquido. Para calcular o salário líquido, deve-se descontar:
- 11% de INSS;
- 15% de Imposto de renda.
Após os descontos, deve-se adicionar um auxílio de R$ 150,00 por dependente.
 */
public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Digite o número de dependentes do funcionário: ");
        int numDependentes = scanner.nextInt();
        final double INSS_PERCENTUAL = 0.11;
        final double IR_PERCENTUAL = 0.15;
        final double AUXILIO_POR_DEPENDENTE = 150.00;
        double descontoINSS = salarioBruto * INSS_PERCENTUAL;
        double salarioBase = salarioBruto - descontoINSS;
        double descontoIR = salarioBase * IR_PERCENTUAL;
        double auxilioDependentes = numDependentes * AUXILIO_POR_DEPENDENTE;
        double salarioLiquido = salarioBase - descontoIR + auxilioDependentes;
        System.out.printf("O salário líquido do funcionário é R$ %.2f", salarioLiquido);
        scanner.close();
    }
}
