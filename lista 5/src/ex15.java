package src;

/* Suponha que a cidade A possui 120 mil habitantes e a cidade B possui 80 mil
habitantes. A população da cidade A cresce a uma taxa de 1,5% ao ano e a cidade B a
uma taxa de 3,5% ao ano. Faça um programa que calcule e apresente em quantos anos a
população da cidade B vai ultrapassar a população da cidade A.
 */
public class ex15 {
    public static void main(String[] args) {
        // População inicial das cidades A e B
        int populacaoA = 120000;
        int populacaoB = 80000;

        // Taxas de crescimento anual (em decimal)
        double taxaCrescimentoA = 0.015; // 1.5% ao ano
        double taxaCrescimentoB = 0.035; // 3.5% ao ano

        int anos = 0;

        // Loop para calcular quantos anos levará para B ultrapassar A
        while (populacaoB <= populacaoA) {
            // Incrementa as populações com base nas taxas de crescimento
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        // Exibe o resultado
        System.out.println("Em " + anos + " anos, a população da cidade B ultrapassará a população da cidade A.");
    }
}
