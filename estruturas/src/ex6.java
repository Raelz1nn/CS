import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilhetesInfantis = 0;
        int bilhetesAdultos = 0;
        String resposta;

        do {
            // Leitura da idade do visitante
            System.out.println("Digite a idade do visitante:");
            int idade = input.nextInt();
            input.nextLine(); // Limpar o buffer do Scanner

            // Determinação do tipo de bilhete
            if (idade < 12) {
                System.out.println("O visitante deve comprar um bilhete infantil.");
                bilhetesInfantis++;
            } else {
                System.out.println("O visitante deve comprar um bilhete adulto.");
                bilhetesAdultos++;
            }

            // Pergunta se deseja cadastrar um novo bilhete
            System.out.println("\nDeseja cadastrar um novo bilhete? (Sim/Não)");
            resposta = input.nextLine();

        } while (!resposta.equalsIgnoreCase("não"));

        // Exibição dos resultados finais
        System.out.println("\nTotal de bilhetes vendidos:");
        System.out.println("Bilhetes infantis: " + bilhetesInfantis);
        System.out.println("Bilhetes adultos: " + bilhetesAdultos);

        input.close();
    }
}
