import java.util.Scanner;

public class ParOuImpar {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n1;
        String resultado;

        System.out.printf("%nDigite 1 números para sabermos se é Par ou Impar!  %n");

        n1 = s.nextInt();

        if (n1 %2 == 0){
            resultado = "PAR";
        } else {
            resultado = "IMPAR";
        }

        System.out.printf("%nEntrada: %n");
        System.out.println(n1);

        System.out.printf("%nSaída: %n");
        System.out.printf("%s %n",resultado);

        s.close();

    }
}
