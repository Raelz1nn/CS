/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;
public class atividade9 {
//Escreva um programa que leia o valor da compra e o valor pago pelo cliente. O
//programa deve calcular e apresentar, o valor da compra, o valor pago pelo cliente, o valor
//do troco e a quantidade de notas que deve ser dada de cada tipo para formar este troco.
//O troco deve ser dado de forma a minimizar a quantidade de notas distribuídas
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor da compra: ");
        double valor = sc.nextDouble();
        System.out.println("digite o valor pago: ");
        double valorP = sc.nextDouble();
        double troco = valorP - valor;
        System.out.println("o valor do troco e de: $ " + troco);
        int[] notas = {100, 10, 1};
        for (int nota : notas) {
            int qtdNotas = (int) (troco / nota);
            if (qtdNotas > 0) {
                System.out.println("Quantidade de notas de R$" + nota + ": " + qtdNotas);
            }
            troco %= nota;
        }

        sc.close();
        }
    }
    

