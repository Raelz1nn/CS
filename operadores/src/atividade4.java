/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade4 {
    //Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
//imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura2
//Além do IMC, o programa deve mostrar se a pessoa está acima do peso ideal (IMC > 25).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("digite o peso em KG: ");
        double peso = sc.nextDouble();
            System.out.println("digite a altura: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
            System.out.println("o imc da pessoa é: " + imc);
        if (imc > 25){
            System.out.println("a pessoa esta a cima do peso ideal");
        }else{
            System.out.println("");
            sc.close();
        }
        }
            
        
        
        
        
       
   
    
}
