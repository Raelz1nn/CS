import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maiorAltura = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaTurma = 0;
        int contadorMulheres = 0;
        int contadorTotal = 0;

        // Laço para ler 10 fichas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ficha " + i);

            System.out.println("Digite a altura (em metros):");
            double altura = sc.nextDouble();

            System.out.println("Digite o código do sexo (1 - masculino, 2 - feminino):");
            int codigoSexo = sc.nextInt();

            // Atualiza a maior altura da turma
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            // Atualiza a soma total das alturas
            somaAlturaTurma += altura;
            contadorTotal++;

            // Verifica se é feminino (código 2)
            if (codigoSexo == 2) {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }
        }

        // Calcula a média de altura da turma
        double mediaAlturaTurma = somaAlturaTurma / contadorTotal;

        // Calcula a média de altura das mulheres (se houver pelo menos uma mulher)
        double mediaAlturaMulheres = 0;
        if (contadorMulheres > 0) {
            mediaAlturaMulheres = somaAlturaMulheres / contadorMulheres;
        }

        // Exibe os resultados
        System.out.println("Maior altura da turma: " + maiorAltura + " metros");
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " metros");
        System.out.println("Média de altura da turma: " + mediaAlturaTurma + " metros");

        sc.close();
    }
}
