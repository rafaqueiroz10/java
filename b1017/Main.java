package b1017;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tempoGasto = input.nextInt();
        int velocidadeMedia = input.nextInt();
        double qtdelitrosGastos = (velocidadeMedia * tempoGasto) / 12.0;
        System.out.printf ("%.3f\n", qtdelitrosGastos);
        input.close();
    }
}