import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Informe dois valores: ");
        valor1 = input.nextInt();
        valor2 = input.nextInt();
        while (valor1 != valor2) {
            System.out.println("Informe dois valores: ");
            valor1 = input.nextInt();
            valor2 = input.nextInt();
        }
        System.out.println("Os valores informados são iguais. Encerrando o programa.");
        input.close();
    }
}
