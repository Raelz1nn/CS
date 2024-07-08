/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("digite o tamanho da pista: ");
                double tamanho = sc.nextDouble();
            System.out.println("digite o peso: ");
                double peso = sc.nextDouble();
            System.out.println("digite a visibilidade: ");
                double visibilidade = sc.nextDouble();
            System.out.println("digite quantos mm esta chovendo: ");
                double mm = sc.nextDouble();
            System.out.println("digite a quantidade de passageiros: ");
                double passageiros = sc.nextDouble();
            System.out.println("possui um sistema de decolagem automatizada? (true/false): ");
                boolean decolagem = sc.nextBoolean();
                    if (tamanho < 1.5){
                         if (peso < 40 && visibilidade >= 20 && mm <= 5){
            System.out.println("O avião pode decolar.");
                            } else {
            System.out.println("O avião não pode decolar.");
                                    }
                            } else if (tamanho >= 1.5 && tamanho <= 2) {
                         if (peso <= 60 && visibilidade >= 20 && mm <= 5) {
                System.out.println("O avião pode decolar.");
                            } else {
                System.out.println("O avião não pode decolar.");
                                    }
                            } else {
                         if (visibilidade >= 20 && mm <= 5 && (passageiros <= 100 || !decolagem)) {
                System.out.println("O avião pode decolar.");
                            } else {
                System.out.println("O avião não pode decolar.");
            }
        }

        sc.close();
        }
    }
    

