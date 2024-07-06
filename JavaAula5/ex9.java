import java.util.Scanner;

/*  (DESAFIO) Observe a seguinte regra aeronáutica (fictícia). Para que um avião possa
decolar de um aeroporto, várias condições devem ser satisfeitas: caso a pista seja menor
que 1,5 Km, o avião deve pesar menos que 40 toneladas, caso a pista possua entre 1,5 e
2 Km, o avião não deve ultrapassar as 60 toneladas. Caso a pista seja superior a 2 Km,
qualquer avião pode decolar. Caso a visibilidade seja inferior a 20 metros, apenas aviões
com sistema de decolagem computadorizada podem decolar. Se estiver chovendo acima
de 5 mm, nenhum avião pode decolar. Se o avião possuir mais de 100 passageiros e
estiver chovendo (independente da intensidade), o avião não pode decolar. Escreva um
programa que leia o tamanho da pista, o peso do avião, visibilidade, intensidade da chuva
(o usuário deve digitar 0 caso não esteja chovendo), número de passageiros e se possui
sistema de decolagem automatizada, e indique se o avião pode decolar ou não.
 */
public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho da pista (em Km): ");
        double tamanho = scanner.nextDouble();
        System.out.print("Peso do avião (em toneladas): ");
        double peso = scanner.nextDouble();
        System.out.print("Visibilidade (em metros): ");
        int visibilidade = scanner.nextInt();
        System.out.print("Intensidade da chuva (em mm, digite 0 se não estiver chovendo): ");
        double intensidade = scanner.nextDouble();
        System.out.print("Número de passageiros: ");
        int passageiros = scanner.nextInt();
        System.out.print("Possui sistema de decolagem automatizada (true/false): ");
        boolean decolagem = scanner.nextBoolean();
        boolean podeDecolar = (tamanho > 2.0) ||
                (tamanho >= 1.5 && tamanho <= 2.0 && peso <= 60.0) ||
                (tamanho < 1.5 && peso < 40.0);
        podeDecolar = podeDecolar && (visibilidade >= 20 || decolagem) &&
                (intensidade <= 5 || (intensidade > 5 && passageiros <= 100));
        System.out.println("Verificação de Decolagem:");
        System.out.println("Pode o avião decolar? " + (podeDecolar ? "Sim" : "Não"));
        scanner.close();
    }
}
