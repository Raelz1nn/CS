package src;

import java.util.Scanner;

/* Uma empresa está cadastrando os candidatos a emprego. Cada candidato preencheu
uma ficha onde estão registrados os seguintes dados: gênero (M, F, I ou X para terminar),
idade e experiência no serviço (S ou N).
Faça um programa que leia estes dados, calcule e apresente:
a) A quantidade de candidatos de cada gênero.
b) A quantidade de candidatos com experiência no serviço.
c) A quantidade de candidatos sem experiência no serviço.
d) A idade média dos candidatos com experiência no serviço.
e) A idade média dos candidatos sem experiência no serviço.
f) O percentual de candidatos com experiência no serviço e idade inferior a 35 anos.
g) A idade do candidato mais jovem.
O programa deve ser repetido até que o usuário digite X como gênero do candidato.
Neste caso, não se deve perguntar as demais informações do candidato. */
public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inicialização das variáveis para contagem e cálculos
        int contadorMasculino = 0;
        int contadorFeminino = 0;
        int contadorIndefinido = 0;
        int contadorExperiencia = 0;
        int contadorSemExperiencia = 0;
        int somaIdadesComExperiencia = 0;
        int somaIdadesSemExperiencia = 0;
        int quantidadeComExperiencia = 0;
        int idadeMaisJovem = Integer.MAX_VALUE;
        int quantidadeTotal = 0;
        double percentualComExperienciaMenor35 = 0.0;

        char genero;
        int idade;
        char experiencia;

        // Loop para cada candidato
        while (true) {
            // Leitura dos dados do candidato
            System.out.print("Digite o gênero do candidato (M, F, I) ou X para terminar: ");
            genero = input.next().charAt(0);
            if (genero == 'X') {
                break; // Termina o loop se o gênero for X
            }

            System.out.print("Digite a idade do candidato: ");
            idade = input.nextInt();

            System.out.print("Possui experiência no serviço? (S/N): ");
            experiencia = input.next().charAt(0);

            // Contagem de candidatos por gênero
            if (genero == 'M') {
                contadorMasculino++;
            } else if (genero == 'F') {
                contadorFeminino++;
            } else if (genero == 'I') {
                contadorIndefinido++;
            }

            // Contagem de candidatos com e sem experiência
            if (experiencia == 'S') {
                contadorExperiencia++;
                somaIdadesComExperiencia += idade;
                quantidadeComExperiencia++;
            } else {
                contadorSemExperiencia++;
                somaIdadesSemExperiencia += idade;
            }

            // Cálculo da idade do candidato mais jovem
            if (idade < idadeMaisJovem) {
                idadeMaisJovem = idade;
            }

            quantidadeTotal++;
        }

        // Cálculo das médias de idade
        double mediaIdadeComExperiencia = quantidadeComExperiencia > 0
                ? (double) somaIdadesComExperiencia / quantidadeComExperiencia
                : 0.0;

        double mediaIdadeSemExperiencia = contadorSemExperiencia > 0
                ? (double) somaIdadesSemExperiencia / contadorSemExperiencia
                : 0.0;

        // Cálculo do percentual de candidatos com experiência e idade inferior a 35
        // anos
        if (quantidadeComExperiencia > 0) {
            percentualComExperienciaMenor35 = (double) contadorExperiencia / quantidadeTotal * 100;
        }

        // Exibição dos resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Quantidade de candidatos masculinos: " + contadorMasculino);
        System.out.println("Quantidade de candidatos femininos: " + contadorFeminino);
        System.out.println("Quantidade de candidatos indefinidos: " + contadorIndefinido);
        System.out.println("Quantidade de candidatos com experiência: " + contadorExperiencia);
        System.out.println("Quantidade de candidatos sem experiência: " + contadorSemExperiencia);
        System.out.println("Idade média dos candidatos com experiência: " + mediaIdadeComExperiencia);
        System.out.println("Idade média dos candidatos sem experiência: " + mediaIdadeSemExperiencia);
        System.out.println("Percentual de candidatos com experiência e idade inferior a 35 anos: "
                + percentualComExperienciaMenor35 + "%");
        System.out.println("Idade do candidato mais jovem: " + idadeMaisJovem);

        input.close();
    }
}
