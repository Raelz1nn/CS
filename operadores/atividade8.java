/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade8 {
//Sabendo que a velocidade do som é de 340 m/s, crie um programa para calcular a
//distância de onde o raio caiu até a pessoa. Para isto, a pessoa deve informar o tempo que
//transcorreu entre ela ter visto o raio e ter ouvido o som do trovão. O tempo deve ser
//informado em segundos e deve ser um valor real, pois a pessoa poderá usar um
//cronômetro de precisão. Além disto, o programa deve apresentar se o raio representou
//algum perigo a pessoa. Um raio representa perigo se ele cair a menos de 200m da
//pessoa.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("digite quanto tempo levou entre ver o raio e ouvir o barulho do trovao (em segundos): ");
        double tempo = sc.nextDouble();
        double distancia = tempo * 340;
            System.out.println("a distancia percorrida pelo raio foi de: " + distancia + "m/s");
        if (distancia <= 200){
            System.out.println("o raio apresentou perigo para voce! ");
      } else {
            System.out.println(""); 
                    }
        }
    }
    

