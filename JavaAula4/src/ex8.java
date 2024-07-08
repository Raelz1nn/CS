import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        int quociente = num / 2;
        int resto = num % 2;
        System.out.println("Quociente da divisão por 2: " + quociente);
        System.out.println("Resto da divisão por 2: " + resto);
        scanner.close();
    }
}
