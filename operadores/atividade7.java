/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade7 {
//Crie um programa para auxiliar engenheiros a calcular a quantidade de piso a ser
//utilizado em uma sala retangular, a quantidade de tinta a ser gasta nas paredes, bem
//como a potência do ar-condicionado. Para isto, o programa deve ler o comprimento, a
//largura e a altura da sala, calcular e imprimir a área de piso da sala, a área total das
//paredes e o volume da sala. O programa deve mostrar também o tamanho do aparelho de
//ar-condicionado a ser instalado. Um pequeno deve ser instalado se o volume da sala for
//inferior a 100 m3
//; um aparelho médio deve ser instalado se o volume da sala estiver entre
//100 e 500 m3
//; e um aparelho grande deve ser instalado caso o volume seja superior a 500m3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("digite a altura em metros: ");
        double altura = sc.nextDouble();
            System.out.println("digite o comprimento em metros: ");
        double comprimento = sc.nextDouble();
            System.out.println("digite a largura em metros: ");
        double largura = sc.nextDouble();
        double area = (comprimento * largura);
            System.out.println("a area do piso e: " + area + "metros quadrados");
        double volume = (altura * largura * comprimento);
            System.out.println("o volume: " + volume + "metros cubicos");
        double areaParedes = 2 * (altura * comprimento + largura * altura);
            System.out.print("a area das paredes e: " + areaParedes + "metros quadrados");
        if (volume < 100){  
            System.out.println("tamanho do ar condicinado: pequeno ");
        } else if (volume >= 100 && volume <= 500){
            System.out.println("tamanho do ar condicionado: medio ");}
       else System.out.println("Tamanho do ar-condicionado: Grande");
     sc.close();   
    }
    
}
