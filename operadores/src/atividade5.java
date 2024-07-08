/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

/**
 *
 * @author alunolages
 */
import java.util.Scanner;
public class atividade5 {
//O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
//Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
//igual ou superior a seis em pelo menos uma das provas. Observe que não se deve
//calcular a média das notas. Faça um programa que leia as três notas do aluno e
//apresente se ele deve ser aprovado ou não
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("digite a nota da primeira prova: ");
            int prova1 = sc.nextInt();
        System.out.println("digite a nota da segunda prova: ");
            int prova2 = sc.nextInt();
        System.out.println("digite a nota do trabalho: ");
            int trabalho = sc.nextInt();
            if (trabalho >= 7 && (prova1 >= 6 || prova2 >= 6)) {
            System.out.println("O aluno está aprovado!");
            } else {
            System.out.println("O aluno está reprovado.");
        }
      sc.close();
    }
    
}
