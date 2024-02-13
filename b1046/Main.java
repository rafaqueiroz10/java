package b1046;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int horaInicial = input.nextInt ();
        int horaFinal = input.nextInt ();
        System.out.println ("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
        input.close ();
    }
}