package b1003;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int soma = a + b;
        System.out.printf ("SOMA = %d\n", soma);
        input.close ();
    }
}