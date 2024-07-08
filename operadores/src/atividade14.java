/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade14 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                System.out.println("digite o seu nome: ");
                    String nome = sc.nextLine();
                System.out.println("digite o valor da sua nota em portugues: ");
                    double portugues = sc.nextDouble();
                System.out.println("digite o valor da sua nota em matematica: ");
                    double matematica = sc.nextDouble();
                System.out.println("digite o valor da sua nota em conhecimentos gerais: ");
                    double conhecimentosGerais = sc.nextDouble();
                    double media = (portugues + matematica + conhecimentosGerais)/3;
                    if (media >= 7)
                System.out.println("o aluno " + nome + " esta aprovado!");
                 else if(portugues < 5 && matematica < 5 && conhecimentosGerais < 5);
                System.out.println("o aluno " + nome + " esta reprovado!");           
         
       
           
    }
    
}
