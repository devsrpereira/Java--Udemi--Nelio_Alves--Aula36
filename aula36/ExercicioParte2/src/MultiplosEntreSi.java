import java.util.Scanner;

public class MultiplosEntreSi {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n1, n2, calculo;
        String resultado;

        System.out.printf("%nDigite 2 números para sabermos se são multiplos!  %n");

        n1 = s.nextInt();
        n2 = s.nextInt();

        if (n1<n2){
            calculo = n2%n1;
        } else {
            calculo = n1%n2;
        }

        if (calculo == 0){
            resultado = "São Multiplos";
        } else {
            resultado = "Não são Multiplos";
        }

        System.out.printf("%nEntrada: %n");
        System.out.printf("%d %d %n",n1,n2);

        System.out.printf("%nSaída: %n");
        System.out.printf("%s %n",resultado);

        s.close();

    }
}
