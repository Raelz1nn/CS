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
//O sistema de avalia��o de uma disciplina � composto de duas provas e um trabalho.
//Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
//igual ou superior a seis em pelo menos uma das provas. Observe que n�o se deve
//calcular a m�dia das notas. Fa�a um programa que leia as tr�s notas do aluno e
//apresente se ele deve ser aprovado ou n�o
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("digite a nota da primeira prova: ");
            int prova1 = sc.nextInt();
        System.out.println("digite a nota da segunda prova: ");
            int prova2 = sc.nextInt();
        System.out.println("digite a nota do trabalho: ");
            int trabalho = sc.nextInt();
            if (trabalho >= 7 && (prova1 >= 6 || prova2 >= 6)) {
            System.out.println("O aluno est� aprovado!");
            } else {
            System.out.println("O aluno est� reprovado.");
        }
      sc.close();
    }
    
}
