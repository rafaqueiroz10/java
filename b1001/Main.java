package b1001;
import java.util.Scanner;
import java.io.IOException;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int x = a + b;
        System.out.println("X = " + x);
        input.close ();
    }
}