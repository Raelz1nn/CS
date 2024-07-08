import java.util.Scanner;

/* Crie um programa para auxiliar engenheiros a calcular a quantidade de piso a ser
utilizado em uma sala retangular, a quantidade de tinta a ser gasta nas paredes, bem
como a potência do ar-condicionado. Para isto, o programa deve ler o comprimento, a
largura e a altura da sala, calcular e imprimir a área de piso da sala, a área total das
paredes e o volume da sala. O programa deve mostrar também o tamanho do aparelho de
ar-condicionado a ser instalado. Um pequeno deve ser instalado se o volume da sala for
inferior a 100 m3
; um aparelho médio deve ser instalado se o volume da sala estiver entre
100 e 500 m3
; e um aparelho grande deve ser instalado caso o volume seja superior a 500
m3
.

 */
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento da sala (em metros): ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite a largura da sala (em metros): ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura da sala (em metros): ");
        double altura = scanner.nextDouble();
        double areaPi = comprimento * largura;
        double areaPa = 2 * (comprimento * altura + largura * altura);
        // Calcula o volume da sala
        double volume = comprimento * largura * altura;
        String tamanhoAr = volume < 100 ? "Pequeno" : (volume >= 100 && volume <= 500) ? "Médio" : "Grande";
        System.out.println("Resultados:");
        System.out.println("Área do piso da sala: " + areaPi + " m²");
        System.out.println("Área total das paredes: " + areaPa + " m²");
        System.out.println("Volume da sala: " + volume + " m³");
        System.out.println("Tamanho do ar-condicionado necessário: " + tamanhoAr);
        scanner.close();
    }
}
