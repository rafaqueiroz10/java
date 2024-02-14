package b1014;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        double y = input.nextDouble();
        double consumo = x / y;
        System.out.printf ("%.3f km/l\n", consumo);
        input.close();
    }
}