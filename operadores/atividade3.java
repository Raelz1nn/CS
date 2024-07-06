/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade3 {
//Crie uma nova versão do programa da questão 2 para que ele mostre uma mensagem
//indicando se a residência está com consumo elevado de energia. A empresa considera
//consumo elevado de energia, se a residência consumir mais de de 70 quilowatts.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("digite quantos Quilowatts foram gastos: ");
                double Quilowatts = sc.nextDouble();
            System.out.println("digite o preço do Quillowats: ");
                double valor = sc.nextDouble();
                double valorConta = Quilowatts * valor;
                double ValorContaAtraso = valorConta * 1.10;
                    if (70 < Quilowatts) {
                    System.out.println("A residência está com consumo elevado de energia.");
                  } else {
            System.out.println("");
                }  
            System.out.println("o valor a ser pago com a conta em dia é de: " + valorConta);
            System.out.println("o valor a ser pago com a conta em atraso é de: " + ValorContaAtraso);
        
        
        
    }
    
}
