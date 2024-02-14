package b1016;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distancia = input.nextInt();
        int tempo = distancia * 2;
        System.out.printf("%d minutos\n", tempo);
        input.close ();
    }
}