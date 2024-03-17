package b1036;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double a, b, c, delta;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (a == 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Impossivel calcular");
            }
            else {
                double x1 = (-b + Math.sqrt (delta)) / (2 * a);
                double x2 = (-b - Math.sqrt (delta)) / (2 * a);
                System.out.printf ("R1 = %.5f\n", x1);
                System.out.printf("R2 = %.5f\n", x2); 
            }
        }
    }
}