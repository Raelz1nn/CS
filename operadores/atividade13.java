/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade13 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("digite um numero: ");
       int a = sc.nextInt();
       System.out.println("digite um numero: ");
       int b = sc.nextInt();
       System.out.println("digite um numero: ");
       int c = sc.nextInt();
       if (a + b < c){
       System.out.println("a soma dos dois primeiros numeros e menor que o terceiro numero!");
       } else if (a + b > c) { 
       System.out.println("a soma dos dois primeiros numeros e maior que o terceiro numero!");
       } else { 
       System.out.println("a soma dos dois primeiros numeros e igual ao terceiro numero");
           
       }
       
       sc.close();
    }
    
}
