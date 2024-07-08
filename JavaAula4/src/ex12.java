import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        int SEGUNDOS = 24 * 3600;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int h = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        int min = scanner.nextInt();
        System.out.print("Digite os segundos: ");
        int seg = scanner.nextInt();
        int segundosI = h * 3600 + min * 60 + seg;
        int segundosF = SEGUNDOS - segundosI;
        System.out.println("Segundos que faltam até o final do dia: " + segundosF);
        scanner.close();
    }
}
