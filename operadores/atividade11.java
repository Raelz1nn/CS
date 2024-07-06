/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a distancia percorrida (KM): ");
        double distancia = sc.nextDouble();
        System.out.println("digite o consumo medio do carro (KM/litro): ");
        double consumoMedio = sc.nextDouble();
        System.out.println("digite o preço do litro do combustivel: ");
        double combustivel = sc.nextDouble();
        double total = (consumoMedio/distancia)*combustivel;
        System.out.println("o valor gasto na viagem foi de: " + total + "$");
        
        sc.close();
        
        
    }
    
}
