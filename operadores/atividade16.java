/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade16 {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos pre�os das mercadorias no dia 01/01/2022
        System.out.println("Digite o pre�o da primeira mercadoria em 01/01/2022:");
        double precoMercadoria1Dia1 = scanner.nextDouble();

        System.out.println("Digite o pre�o da segunda mercadoria em 01/01/2022:");
        double precoMercadoria2Dia1 = scanner.nextDouble();

        System.out.println("Digite o pre�o da terceira mercadoria em 01/01/2022:");
        double precoMercadoria3Dia1 = scanner.nextDouble();

        // Leitura dos pre�os das mercadorias no dia 01/02/2022
        System.out.println("Digite o pre�o da primeira mercadoria em 01/02/2022:");
        double precoMercadoria1Dia2 = scanner.nextDouble();

        System.out.println("Digite o pre�o da segunda mercadoria em 01/02/2022:");
        double precoMercadoria2Dia2 = scanner.nextDouble();

        System.out.println("Digite o pre�o da terceira mercadoria em 01/02/2022:");
        double precoMercadoria3Dia2 = scanner.nextDouble();

        // Calculando a infla��o de cada mercadoria
        double inflacaoMercadoria1 = ((precoMercadoria1Dia2 - precoMercadoria1Dia1) / precoMercadoria1Dia1) * 100;
        double inflacaoMercadoria2 = ((precoMercadoria2Dia2 - precoMercadoria2Dia1) / precoMercadoria2Dia1) * 100;
        double inflacaoMercadoria3 = ((precoMercadoria3Dia2 - precoMercadoria3Dia1) / precoMercadoria3Dia1) * 100;

        // Calculando a infla��o m�dia
        double inflacaoMedia = (inflacaoMercadoria1 + inflacaoMercadoria2 + inflacaoMercadoria3) / 3;

        // Verificando se a infla��o est� acima da meta
        if (inflacaoMedia > 0.55) {
            System.out.println("A infla��o do per�odo est� acima da meta.");
        } else {
            System.out.println("A infla��o do per�odo est� dentro da meta.");
        }

        scanner.close();
    }
    
}
