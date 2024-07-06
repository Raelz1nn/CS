/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade18 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Pedindo o dia, mês e ano de nascimento
        System.out.println("Digite o dia de nascimento:");
        int diaNascimento = scanner.nextInt();
        System.out.println("Digite o mês de nascimento:");
        int mesNascimento = scanner.nextInt();
        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = scanner.nextInt();
        
        // Pedindo o dia, mês e ano atual
        System.out.println("Digite o dia atual:");
        int diaAtual = scanner.nextInt();
        System.out.println("Digite o mês atual:");
        int mesAtual = scanner.nextInt();
        System.out.println("Digite o ano atual:");
        int anoAtual = scanner.nextInt();
        
        // Calculando a idade em dias
        int idadeEmDias = calcularIdadeEmDias(diaNascimento, mesNascimento, anoNascimento, diaAtual, mesAtual, anoAtual);
        
        // Exibindo o resultado
        System.out.println("A pessoa viveu aproximadamente " + idadeEmDias + " dias.");
        
        scanner.close();
    }
    
    // Método para calcular a idade em dias
    public static int calcularIdadeEmDias(int diaNascimento, int mesNascimento, int anoNascimento, int diaAtual, int mesAtual, int anoAtual) {
        int diasDeVida = 0;
        
        // Convertendo anos em dias
        diasDeVida += (anoAtual - anoNascimento) * 360;
        
        // Convertendo meses em dias
        diasDeVida += (mesAtual - mesNascimento) * 30;
        
        // Adicionando os dias restantes
        diasDeVida += diaAtual - diaNascimento;
        
        return diasDeVida;

    }
    
}
