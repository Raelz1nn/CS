/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade16 {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos preços das mercadorias no dia 01/01/2022
        System.out.println("Digite o preço da primeira mercadoria em 01/01/2022:");
        double precoMercadoria1Dia1 = scanner.nextDouble();

        System.out.println("Digite o preço da segunda mercadoria em 01/01/2022:");
        double precoMercadoria2Dia1 = scanner.nextDouble();

        System.out.println("Digite o preço da terceira mercadoria em 01/01/2022:");
        double precoMercadoria3Dia1 = scanner.nextDouble();

        // Leitura dos preços das mercadorias no dia 01/02/2022
        System.out.println("Digite o preço da primeira mercadoria em 01/02/2022:");
        double precoMercadoria1Dia2 = scanner.nextDouble();

        System.out.println("Digite o preço da segunda mercadoria em 01/02/2022:");
        double precoMercadoria2Dia2 = scanner.nextDouble();

        System.out.println("Digite o preço da terceira mercadoria em 01/02/2022:");
        double precoMercadoria3Dia2 = scanner.nextDouble();

        // Calculando a inflação de cada mercadoria
        double inflacaoMercadoria1 = ((precoMercadoria1Dia2 - precoMercadoria1Dia1) / precoMercadoria1Dia1) * 100;
        double inflacaoMercadoria2 = ((precoMercadoria2Dia2 - precoMercadoria2Dia1) / precoMercadoria2Dia1) * 100;
        double inflacaoMercadoria3 = ((precoMercadoria3Dia2 - precoMercadoria3Dia1) / precoMercadoria3Dia1) * 100;

        // Calculando a inflação média
        double inflacaoMedia = (inflacaoMercadoria1 + inflacaoMercadoria2 + inflacaoMercadoria3) / 3;

        // Verificando se a inflação está acima da meta
        if (inflacaoMedia > 0.55) {
            System.out.println("A inflação do período está acima da meta.");
        } else {
            System.out.println("A inflação do período está dentro da meta.");
        }

        scanner.close();
    }
    
}
