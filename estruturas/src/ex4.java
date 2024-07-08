import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeOtimo = 0;
        int somaIdadeRuim = 0;
        int contadorRuim = 0;
        int idadeMaior = Integer.MIN_VALUE;
        int idadeMenor = Integer.MAX_VALUE;

        // Leitura dos dados dos 20 espectadores
        for (int i = 1; i <= 20; i++) {
            System.out.println("Espectador " + i);

            // Leitura da idade
            System.out.println("Digite a idade:");
            int idade = 0;
            try {
                idade = input.nextInt();
            } catch (Exception e) {
                System.out.println("Erro ao ler idade. Insira um valor válido.");
                input.nextLine(); // Limpa o buffer do scanner
                i--; // Volta uma iteração para repetir a leitura
                continue;
            }

            // Leitura da opinião sobre o filme
            System.out.println("Digite a opinião sobre o filme (A - Ótimo, B - Bom, C - Regular, D - Ruim):");
            char opiniao = ' ';
            try {
                opiniao = input.next().toUpperCase().charAt(0); // Converte para maiúscula e pega o primeiro caractere
            } catch (Exception e) {
                System.out.println("Erro ao ler opinião. Insira um valor válido.");
                input.nextLine(); // Limpa o buffer do scanner
                i--; // Volta uma iteração para repetir a leitura
                continue;
            }

            // Processamento das respostas
            if (opiniao == 'A') {
                quantidadeOtimo++;
            } else if (opiniao == 'D') {
                somaIdadeRuim += idade;
                contadorRuim++;
            }

            // Verifica maior e menor idade
            if (idade > idadeMaior) {
                idadeMaior = idade;
            }
            if (idade < idadeMenor) {
                idadeMenor = idade;
            }
        }

        // Calcula média de idade das pessoas que responderam "Ruim"
        double mediaIdadeRuim = 0;
        if (contadorRuim > 0) {
            mediaIdadeRuim = (double) somaIdadeRuim / contadorRuim;
        }

        // Calcula diferença de idade entre a pessoa mais velha e mais nova que
        // responderam o questionário
        int diferencaIdade = idadeMaior - idadeMenor;

        // Exibe os resultados
        System.out.println("Quantidade de respostas 'Ótimo': " + quantidadeOtimo);
        System.out.println("Média de idade das pessoas que responderam 'Ruim': " + mediaIdadeRuim);
        System.out.println("Diferença de idade entre a pessoa mais velha e mais nova: " + diferencaIdade);

        input.close(); // Fecha o Scanner
    }
}
