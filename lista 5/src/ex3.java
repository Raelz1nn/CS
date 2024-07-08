package src;

public class ex3 {
    /*
     * Faça um programa que mostre na tela os números ímpares de 1 a 100.
     */
    public static void main(String[] args) {
        // Utilizando um loop for para iterar de 1 a 100
        for (int i = 1; i <= 100; i++) {
            // Verifica se o número é ímpar usando o operador %
            if (i % 2 != 0) {
                System.out.println(i); // Imprime o número ímpar
            }
        }
    }
}