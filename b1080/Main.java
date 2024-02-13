package b1080;
import java.util.Scanner;

public class Main {

    public static void carregarValores (int[] vetor, int tam) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            vetor[i] = ler.nextInt ();
        }
    }

    public static int procuraIndiceDoMaiorElemento (int[] vetor) {
        int indiceDoMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceDoMaior]) {
                indiceDoMaior = i;
            }
        }
        return indiceDoMaior;
    }
    
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetor[] = new int[100];
        carregarValores(vetor, 100);
        int indiceDoMaior = procuraIndiceDoMaiorElemento(vetor);
        System.out.println(vetor[indiceDoMaior]);
        System.out.println(indiceDoMaior + 1);

        ler.close ();
    }    
}