import java.util.Scanner;

public class HoraDeJogo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n1, n2, calculo;
        String resultado;

        System.out.printf("%nDigite a hora de inicio e fim do jogo!  %n");

        n1 = s.nextInt();
        n2 = s.nextInt();

        if (n1<n2){
            calculo = n2-n1;
        } else {
            calculo = (n2+24)-n1;
        }

        System.out.printf("%nEntrada: %n");
        System.out.printf("%d %d %n",n1,n2);

        System.out.printf("%nSaída: %n");
        System.out.printf("O JOGO DUROU %d HORAS(S)%n",calculo);

        s.close();

    }
}
