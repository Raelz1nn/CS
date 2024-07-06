public class ex14 {
    /*
     * João recebeu seu salário de R$ 1500,00 e precisa pagar duas contas (C1=R$
     * 200,00
     * e C2=R$120,00). Como as contas estão atrasadas, João terá de pagar multa de
     * 2% sobre
     * cada conta. Faça um programa que calcule e mostre quanto restará do salário
     * do João
     */
    public static void main(String[] args) {
        double salario = 1500.00;
        double C1 = 200.00;
        double C2 = 120.00;
        double taxa = 0.02;
        double multaC1 = C1 * taxa;
        double multaC2 = C2 * taxa;
        double totalC1 = C1 + multaC1;
        double totalC2 = C2 + multaC2;
        double total = totalC1 + totalC2;
        double restanteSalario = salario - total;
        System.out.println("Salário inicial de João: R$" + salario);
        System.out.println("Total a pagar (C1 + multa + C2 + multa): R$" + total);
        System.out.println("Saldo restante: R$" + restanteSalario);
    }
}
