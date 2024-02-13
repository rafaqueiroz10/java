package b1162;
import java.util.Scanner;

public class Main {
    public void carregarVagoes (int[] arrVagoes, int tam, Scanner input) {
        for (int i = 0; i < tam; i++) {
            arrVagoes[i] = input.nextInt();
        }
    }

    public void troca (int[] arrVagoes, int indiceA, int indiceB) {
        int aux = arrVagoes[indiceA];
        arrVagoes[indiceA] = arrVagoes[indiceB];
        arrVagoes[indiceB] = aux;
    }

    public int contarTrocas (int[] arrVagoes) {
        int contTrocas = 0;
        for (int i = 0; i < arrVagoes.length; i++) {
            for (int j = i + 1; j < arrVagoes.length; j++) {
                if (arrVagoes[i] > arrVagoes[j]) {
                    troca (arrVagoes, i, j);
                    contTrocas++;
                }
            }
        }
        return contTrocas;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Main main = new Main ();

        for (int i = 0; i < n; i++) {
            int tamanhoDoTrem = input.nextInt();
            int arrVagoes[] = new int[tamanhoDoTrem];

            main.carregarVagoes(arrVagoes, tamanhoDoTrem, input);
            int contTrocas = main.contarTrocas(arrVagoes);

            System.out.println ("Optimal train swapping takes " + contTrocas + " swaps.");
        }
    }
}