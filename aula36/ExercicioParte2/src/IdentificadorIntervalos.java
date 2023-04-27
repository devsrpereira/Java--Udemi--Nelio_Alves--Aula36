import java.util.Scanner;

public class IdentificadorIntervalos {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double n1;
        String resultado = "";

        System.out.printf("%nDigite 1 número para identificarmos o seu intervalo!  %n");

        n1 = s.nextDouble();

        if (n1>=0 && n1<=25){
            resultado = "Intervalo [0,25]";
        } else if (n1>25 && n1<=50){
            resultado = "Intervalo (25,50]";
        } else if (n1>50 && n1<=75){
            resultado = "Intervalo (50,75]";
        } else if (n1>75 && n1<=100){
            resultado = "Intervalo (75,100]";
        } else if (n1<0 || n1>100){
            resultado = "Fora do intervalo";
        }

        System.out.printf("%nEntrada: %n");
        System.out.println(n1);

        System.out.printf("%nSaída: %n");
        System.out.printf("%s %n",resultado);

        s.close();

    }
}
