
import java.util.*;

public class Sort {

    public static void main(String[] args) {
        int n, aux;
        Scanner scanner = new Scanner(System.in);
        int[] vetor;

        System.out.println("Insira o tamanho do vetor: \n");
        n = scanner.nextInt();
        vetor = new int[n];
        String resposta;

        //preenchendo os elementos do vetor
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o elemento na posição " + i);
            vetor[i] = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println();
        //Mostrando os elementos preenchidos
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i]);
        }

        System.out.println();
        System.out.println("Ordenar em ordem crescente ou decrescente? C/D ");
        resposta = scanner.nextLine();

        if (resposta.equals("C")) {
            //ordenação de forma crescente
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        aux = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = aux;
                    }
                }
            }
            System.out.println();
            //Mostrando os elementos após ordenação
            for (int i = 0; i < n; i++) {
                System.out.print(vetor[i]);
            }

        } else if (resposta.equals("D")) {
            //ordenação de forma descrescente
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (vetor[i] > vetor[j]) {
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;
                    }
                }
            }
            System.out.println();
            //Mostrando os elementos após ordenação
            for (int i = 0; i < n; i++) {
                System.out.print(vetor[i]);
            }
        }
    }

}
