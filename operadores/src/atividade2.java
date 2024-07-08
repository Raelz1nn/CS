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
public class atividade2 {
    //Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
    //quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
    //pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
    //em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
    //conta. O programa não deve perguntar se a conta será paga em atraso ou não, ele deve
    //sempre calcular e apresentar os dois valores, para que o usuário analise a diferença e
    //decida se vai pagar a conta em dia ou não.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("digite quantos Quilowatts foram gastos: ");
                double Quilowatts = sc.nextDouble();
            System.out.println("digite o preço do Quillowats: ");
                double valor = sc.nextDouble();
                double valorConta = Quilowatts * valor;
                double ValorContaAtraso = valorConta * 1.10;
            System.out.println("o valor a ser pago com a conta em dia é de: " + valorConta);
            System.out.println("o valor a ser pago com a conta em atraso é de: " + ValorContaAtraso);
        sc.close();
        
               
        
        
        
        
        
    }
    
}
