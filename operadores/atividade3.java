/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade3 {
//Crie uma nova vers�o do programa da quest�o 2 para que ele mostre uma mensagem
//indicando se a resid�ncia est� com consumo elevado de energia. A empresa considera
//consumo elevado de energia, se a resid�ncia consumir mais de de 70 quilowatts.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("digite quantos Quilowatts foram gastos: ");
                double Quilowatts = sc.nextDouble();
            System.out.println("digite o pre�o do Quillowats: ");
                double valor = sc.nextDouble();
                double valorConta = Quilowatts * valor;
                double ValorContaAtraso = valorConta * 1.10;
                    if (70 < Quilowatts) {
                    System.out.println("A resid�ncia est� com consumo elevado de energia.");
                  } else {
            System.out.println("");
                }  
            System.out.println("o valor a ser pago com a conta em dia � de: " + valorConta);
            System.out.println("o valor a ser pago com a conta em atraso � de: " + ValorContaAtraso);
        
        
        
    }
    
}
