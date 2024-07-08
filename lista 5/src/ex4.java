package src;

import java.util.Scanner;

/*  Faça um programa que leia um número inteiro e apresente a sua tabuada. */
public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int numero = input.nextInt();

        // Mostrar a tabuada do número fornecido
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        input.close();
    }
}
