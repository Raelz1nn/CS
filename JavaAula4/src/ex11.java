import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int h = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        int min = scanner.nextInt();
        System.out.print("Digite os segundos: ");
        int seg = scanner.nextInt();
        int totalS = h * 3600 + min * 60 + seg;
        System.out.println("\nTotal de segundos desde o início do dia: " + totalS);
        scanner.close();
    }
}
