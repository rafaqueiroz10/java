package b1047;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int horaInicial = input.nextInt();
        int minutoInicial = input.nextInt();
        int horaFinal = input.nextInt();
        int minutoFinal = input.nextInt();

        int numHoras, numMinutos, tempoDeJogo;
        tempoDeJogo = (horaFinal * 60 + minutoFinal) - (horaInicial * 60 + minutoInicial);
        tempoDeJogo = ((tempoDeJogo + 24 * 60) % (24 * 60) + 1440) % 1440;
        //tempoDeJogo = (((tempoDeJogo / 1440) * (tempoDeJogo / 1440) * tempoDeJogo)) * 24 * 60;


        // int iguais = (horaInicial - minutoInicial) * (minutoInicial - horaFinal) * (horaFinal - minutoFinal) * (minutoFinal - horaInicial);
        // int i = 1 - iguais;
        // tempoDeJogo *= 1 - ((horaInicial - minutoInicial) * (minutoInicial - horaFinal) * (horaFinal - minutoFinal) * (minutoFinal - horaInicial));
        //int diferencaHoras = horaFinal - horaInicial;
        //int diferencaMinutos = minutoFinal - minutoInicial;
        //int jogoDurou = (diferencaHoras * 60 + diferencaMinutos) / ((diferencaHoras * 60 + diferencaMinutos) + 1);

        //tempoDeJogo = (diferencaHoras * 60 + diferencaMinutos) * jogoDurou;

        //tempoDeJogo = (diferencaHoras * 60 + diferencaMinutos) * (1 - ((diferencaHoras * 60 + diferencaMinutos) / 1441));


        //numHoras = tempoDeJogo / 60;
        //numMinutos = tempoDeJogo % 60;

        int zeroOrResult = (tempoDeJogo / 1441) * 1440;

        numHoras = (tempoDeJogo - zeroOrResult) / 60;
        numMinutos = (tempoDeJogo - zeroOrResult) % 60;


        System.out.println("O JOGO DUROU " + numHoras + " HORA(S) E " + numMinutos + " MINUTO(S)");
        input.close();
    }   
}