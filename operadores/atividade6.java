/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade6 {
//Crie uma nova o programa da questão 5, para que ele considere a frequência do aluno.
//Agora, para ser aprovado o aluno precisa ter nota igual ou superior a sete no trabalho,
//nota igual ou superior a seis em pelo menos uma das provas e frequência igual ou
//superior a 75%. Além desta diferença, caso o aluno tenha nota seis no trabalho ele
//poderá ser aprovado, mas para isto precisa ter frequência igual ou superior a 90%.
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("digite a nota da primeira prova: ");
            int prova1 = sc.nextInt();
        System.out.println("digite a nota da segunda prova: ");
            int prova2 = sc.nextInt();
        System.out.println("digite a nota do trabalho: ");
            int trabalho = sc.nextInt();
        System.out.println("digite a sua frequencia (%): ");
            int frequencia = sc.nextInt();
            if ((trabalho >= 7 ||trabalho == 6 && frequencia >= 90) && 
                (prova1 >= 6 || prova2 >= 6) && frequencia >= 75) {
            System.out.println("O aluno está aprovado!");
            } else {
            System.out.println("O aluno está reprovado.");
        }
      sc.close();
    }
    
}
