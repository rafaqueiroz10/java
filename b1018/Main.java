package b1018;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        System.out.printf ("%d\n", n);

        int notasDe100 = n / 100;
        System.out.printf ("%d nota(s) de R$ 100,00\n", notasDe100);

        int notasDe50 = (n - notasDe100 * 100) / 50;
        System.out.printf("%d nota(s) de R$ 50,00\n", notasDe50);

        int notasDe20 =  n - (notasDe50 * 50 + notasDe100 * 100) / 20;
        System.out.printf ("%d nota(s) de R$ 20,00\n", notasDe20);
    }
}