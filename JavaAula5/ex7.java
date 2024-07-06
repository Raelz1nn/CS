import java.util.Scanner;

/* Sabendo que a velocidade do som é de 340 m/s, crie um programa para calcular a
distância de onde o raio caiu até a pessoa. Para isto, a pessoa deve informar o tempo que
transcorreu entre ela ter visto o raio e ter ouvido o som do trovão. O tempo deve ser
informado em segundos e deve ser um valor real, pois a pessoa poderá usar um
cronômetro de precisão. Além disto, o programa deve apresentar se o raio representou
algum perigo a pessoa. Um raio representa perigo se ele cair a menos de 200m da
pessoa.

 */
public class ex7 {
    public static void main(String[] args) {
        final double VELOCIDADE = 340.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo decorrido entre ver o raio e ouvir o trovão (em segundos): ");
        double tempoD = scanner.nextDouble();
        double distancia = VELOCIDADE * tempoD;
        String perigo = distancia < 200 ? "Sim" : "Não";
        System.out.println("\nResultados:");
        System.out.println("Distância até onde o raio caiu: " + distancia + " metros");
        System.out.println("O raio representou perigo? " + perigo);
        scanner.close();
    }
}
