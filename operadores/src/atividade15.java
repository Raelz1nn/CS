/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;
import java.util.Scanner;
public class atividade15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o salario bruto do funcionario: ");
        double salario = sc.nextDouble();
        System.out.println("digite quantos dependentes esse funcionario tem: ");
        double dependentes = sc.nextDouble();
        double auxilio = 150.00;
        double inss = (salario * 0.11);
        double imposto = (salario * 0.15);
        double valorTotal = salario - inss - imposto + (auxilio * dependentes);
        System.out.println("o salario com os descontos e o auxilio é igual a " + valorTotal);
        
        
       
  
    }
    
}
