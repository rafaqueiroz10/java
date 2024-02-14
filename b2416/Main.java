package b2416;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int n = input.nextInt();
        int pontoDeTermino = c % n;
        System.out.printf("%d\n", pontoDeTermino);
    }
}