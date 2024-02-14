package b1019;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tempo = input.nextInt();
        int tempoEmHoras = tempo / 3600;
        int tempoEmMinutos = (tempo % 3600) / 60;
        int tempoEmSegundos = (tempo % 3600) % 60;

        System.out.printf ("%d:%d:%d\n", tempoEmHoras, tempoEmMinutos, tempoEmSegundos);
        input.close();
    }
}