import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de segundos do vídeo: ");
        int Seg = scanner.nextInt();
        int h = Seg / 3600; // 1 hora = 3600 segundos
        int min = (Seg % 3600) / 60; // 1 minuto = 60 segundos
        int seg = Seg % 60;
        System.out.println("\nDuração do vídeo:");
        System.out.println("Horas: " + h);
        System.out.println("Minutos: " + min);
        System.out.println("Segundos: " + seg);
        scanner.close();
    }
}
