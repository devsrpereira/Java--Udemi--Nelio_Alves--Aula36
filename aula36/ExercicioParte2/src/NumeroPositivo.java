import java.util.Scanner;

public class NumeroPositivo{
    public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            double n1;
            String resultado;

            System.out.printf("%nDigite 1 números!  %n");

            n1 = s.nextInt();

            if (n1<0){
                resultado = "NEGATIVO";
            } else {
                resultado = "POSITIVO";
            }

            System.out.printf("%nEntrada: %n");
            System.out.println(n1);

            System.out.printf("%nSaída: %n");
            System.out.printf("%s %n",resultado);

            s.close();

    }
}