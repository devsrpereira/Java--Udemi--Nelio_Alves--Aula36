import java.util.Scanner;

public class Coordenadas {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double n1, n2;
        String resultado ="";

        System.out.printf("%nDigite as duas coordenadas para identificarmos o quadrante!  %n");

        n1 = s.nextDouble();
        n2 = s.nextDouble();

        if (n1>0 && n2>0){
            resultado = "Q1";
        } else if (n1>0 && n2<0){
            resultado = "Q4";
        } else if (n1<0 && n2>0){
            resultado = "Q2";
        } else if (n1<0 && n2<0){
            resultado = "Q3";
        } else {
            resultado ="Origem";
        }

        System.out.printf("%nEntrada: %n");
        System.out.printf("%.1f %.1f",n1,n2);

        System.out.printf("%nSaída: %n");
        System.out.printf("%s %n",resultado);

        s.close();

    }
}
