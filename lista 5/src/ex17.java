package src;

import java.util.Scanner;

/* ) Sem utilizar a operação de multiplicação, escreva um algoritmo que multiplique dois
números inteiros, usando somas sucessivas. */
public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números a serem multiplicados
        System.out.print("Digite o primeiro número (multiplicando): ");
        int multiplicando = scanner.nextInt();

        System.out.print("Digite o segundo número (multiplicador): ");
        int multiplicador = scanner.nextInt();

        // Verifica se um dos números é zero
        if (multiplicando == 0 || multiplicador == 0) {
            System.out.println("Resultado da multiplicação: 0");
        } else {
            // Inicializa variáveis para o resultado da multiplicação
            int resultado = 0;
            int contador = 0;

            // Faz a multiplicação utilizando somas sucessivas
            while (contador < Math.abs(multiplicador)) {
                resultado += multiplicando;
                contador++;
            }

            // Ajusta o sinal do resultado se necessário
            if ((multiplicando > 0 && multiplicador < 0) || (multiplicando < 0 && multiplicador > 0)) {
                resultado = -resultado;
            }

            // Exibe o resultado da multiplicação
            System.out.println("Resultado da multiplicação: " + resultado);
        }

        scanner.close();
    }
}
