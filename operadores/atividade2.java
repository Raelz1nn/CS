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
    //Crie um programa que leia o pre�o do quilowatt de energia e a quantidade gasta de
    //quilowatts em uma resid�ncia. O programa deve calcular e imprimir o valor a ser pago
    //pela resid�ncia caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
    //em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
    //conta. O programa n�o deve perguntar se a conta ser� paga em atraso ou n�o, ele deve
    //sempre calcular e apresentar os dois valores, para que o usu�rio analise a diferen�a e
    //decida se vai pagar a conta em dia ou n�o.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("digite quantos Quilowatts foram gastos: ");
                double Quilowatts = sc.nextDouble();
            System.out.println("digite o pre�o do Quillowats: ");
                double valor = sc.nextDouble();
                double valorConta = Quilowatts * valor;
                double ValorContaAtraso = valorConta * 1.10;
            System.out.println("o valor a ser pago com a conta em dia � de: " + valorConta);
            System.out.println("o valor a ser pago com a conta em atraso � de: " + ValorContaAtraso);
        sc.close();
        
               
        
        
        
        
        
    }
    
}
