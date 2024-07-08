package src;

import java.util.Scanner;

/* Para uma turma de 45 alunos, construa um programa que leia a idade e a altura de
cada aluno e determine:
a) Quanto alunos tem menos de 18 anos.
b) A idade média dos alunos com menos de 1,70m de
 altura.
c) A altura média dos alunos com mais de 20 anos. */
public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variáveis para armazenar as estatísticas
        int alunosMenorDe18Anos = 0;
        int somaIdadesMenor170 = 0;
        int quantidadeMenor170 = 0;
        double somaAlturasMais20 = 0;
        int quantidadeMais20 = 0;

        // Leitura dos dados para os 45 alunos
        for (int i = 1; i <= 45; i++) {
            System.out.println("Dados do aluno " + i + ":");

            // Leitura da idade
            System.out.print("Digite a idade: ");
            int idade = input.nextInt();

            // Leitura da altura
            System.out.print("Digite a altura (em metros): ");
            double altura = input.nextDouble();

            // Verificações para cada estatística
            if (idade < 18) {
                alunosMenorDe18Anos++;
            }

            if (altura < 1.70) {
                somaIdadesMenor170 += idade;
                quantidadeMenor170++;
            }

            if (idade > 20) {
                somaAlturasMais20 += altura;
                quantidadeMais20++;
            }
        }

        // Cálculo da idade média dos alunos com menos de 1,70m de altura
        double idadeMediaMenor170 = 0;
        if (quantidadeMenor170 > 0) {
            idadeMediaMenor170 = (double) somaIdadesMenor170 / quantidadeMenor170;
        }

        // Cálculo da altura média dos alunos com mais de 20 anos
        double alturaMediaMais20 = 0;
        if (quantidadeMais20 > 0) {
            alturaMediaMais20 = somaAlturasMais20 / quantidadeMais20;
        }

        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.println("a) Alunos com menos de 18 anos: " + alunosMenorDe18Anos);
        System.out.println("b) Idade média dos alunos com menos de 1,70m de altura: " + idadeMediaMenor170);
        System.out.println("c) Altura média dos alunos com mais de 20 anos: " + alturaMediaMais20 + " metros");

        input.close();
    }
}
