import java.util.Scanner;

/* Faça um programa que calcule os gastos com combustível em uma viagem. O
programa deve solicitar ao usuário a distância a ser percorrida em Km, o consumo médio
do carro (quantos quilômetros o carro percorre com um litro de combustível) em Km/litro e
o preço do litro do combustível. O programa deve calcular e apresentar o valor em R$ a
ser gasto com combustível na viagem.

 */
public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância a ser percorrida (em Km): ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite o consumo médio do carro (em Km/litro): ");
        double consumoM = scanner.nextDouble();
        System.out.print("Digite o preço do litro do combustível (em R$): ");
        double precoL = scanner.nextDouble();
        double gastosC = (distancia / consumoM) * precoL;
        System.out.println("\nResultados:");
        System.out.printf("Distância a ser percorrida: %.2f Km\n", distancia);
        System.out.printf("Consumo médio do carro: %.2f Km/litro\n", consumoM);
        System.out.printf("Preço do litro do combustível: R$ %.2f\n", precoL);
        System.out.printf("Valor a ser gasto com combustível: R$ %.2f\n", gastosC);
        scanner.close();
    }
}
