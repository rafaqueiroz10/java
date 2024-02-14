package b1002;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double raio = input.nextDouble();
        double area = 3.14159 * raio * raio;
        System.out.printf ("A=%.4f\n", area);
        input.close ();
    }
}