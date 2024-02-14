package b1008;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt ();
        int numHorasTrabalhadas = input.nextInt();
        double valorPorHoraTrabalhada = input.nextDouble();
        double salario = numHorasTrabalhadas * valorPorHoraTrabalhada;
        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        input.close ();
    }
}