import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário que insira a distância total percorrida em km
        System.out.print("Digite a distância total percorrida (em km): ");
        double distancia = scanner.nextDouble(); // Lê a distância total em km
        // Solicita ao usuário que insira o volume de combustível consumido em litros
        System.out.print("Digite o volume de combustível consumido (em litros): ");
        double volume = scanner.nextDouble(); // Lê o volume de combustível em litros
        // Calcula o consumo médio
        double consumo = distancia / volume;
        System.out.println("O consumo médio do veículo é: " + consumo + " km/l");
        scanner.close();
    }
}
