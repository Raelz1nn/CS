import java.util.Scanner;

/* Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura2
.
Além do IMC, o programa deve mostrar se a pessoa está acima do peso ideal (IMC > 25).
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso da pessoa (em Kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("\nO IMC da pessoa é: " + imc);
        System.out.print("A pessoa está ");
        System.out.print(imc > 25 ? "acima" : "dentro");
        System.out.println(" do peso ideal.");
        scanner.close();
    }
}
