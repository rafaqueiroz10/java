package b1040;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        @SuppressWarnings("unused")
        DecimalFormat df = new DecimalFormat("0.0");
        double n1, n2, n3, n4, media;
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        n4 = input.nextDouble();

        media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;
        System.out.println("Media: " + df.format(media));
        
        if (media < 5) {
            System.out.println("Aluno reprovado.");
        }
        else if (media < 7) {
            System.out.println("Aluno em exame.");
            double notaExame = input.nextDouble();
            System.out.printf ("Nota do exame: %.1f\n", notaExame);
            media = (notaExame + media) / 2;
            System.out.println ("Aluno " (media < 5) ? "reprovado." : "aprovado.");
            System.out.printf("Media final: %.1f\n", media);
        }
        else {
            System.out.println("Aluno aprovado.");
        }
    }
}