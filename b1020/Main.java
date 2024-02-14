package b1020;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        int anos = idade / 365;
        int meses = (idade % 365) / 30;
        int dias = (idade % 365) % 30;
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);
        input.close();
    }
}