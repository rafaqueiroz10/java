package b1963;
import java.util.Scanner;

public class Main {
    public static double calculaPercentualDeAumento (double valorAntigo, double valorNovo) {
        return ((valorNovo - valorAntigo) / valorAntigo) * 100;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double b = input.nextInt();
        double percentualDeAumento = calculaPercentualDeAumento (a, b);
        System.out.println(String.format("%.2f%%", percentualDeAumento));
    }
}
