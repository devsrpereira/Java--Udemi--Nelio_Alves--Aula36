import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double n1,g28,g18,g8,resultado = 0;


        System.out.printf("%nDigite o valor salarial para o calculo do imposto!  %n");

        n1 = s.nextDouble();

        if (n1<=2000){
            resultado = 0;
        } else if (n1>2000 && n1<=3000){
            g8 = (n1-2000)*0.08;
            resultado = g8;
        }  else if (n1>3000 && n1<=4500){
            g18 = (n1-3000)*0.18;
            g8 = 999.99*0.08;
            resultado = g18+g8;
        }  else if (n1>4500){
            g28 = (n1-4500)*0.28;
            g18 = 1499.99*0.18;
            g8 = 999.99*0.08;
            resultado = g28+g18+g8;
        }

        System.out.printf("%nEntrada: %n");
        System.out.println(n1);

        System.out.printf("%nSaída: %n");

        if (resultado == 0){
            System.out.printf("Isento %n");
        } else{
            System.out.printf("R$ %.2f %n", resultado);
        }

        s.close();

    }
}
