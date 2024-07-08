import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso atual da pessoa (em kg): ");
        double peso = scanner.nextDouble();
        double novoPeso = peso * 1.15;
        double novoPesoE = peso * 0.80;
        System.out.println("Novo peso se a pessoa engordar 15%: " + novoPeso + " kg");
        System.out.println("Novo peso se a pessoa emagrecer 20%: " + novoPesoE + " kg");
        scanner.close();
    }

}
