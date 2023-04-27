import java.util.Scanner;

public class CodigoPreco {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int codigo;
        double preco = 1;
        double resultado, qtde;

        System.out.printf("%nDigite o codigo e a quantidade do item!  %n");

        codigo = s.nextInt();
        qtde = s.nextDouble();

        if (codigo==1){
            preco = 4.00;
        } else if (codigo==2) {
            preco = 4.50;
        } else if (codigo==3) {
            preco = 5.00;
        } else if (codigo==4) {
            preco = 2.00;
        } else if (codigo==5) {
            preco = 2.00;
        } else {
            System.out.println("Item não encontrato, favor revisar o codigo!");
        }

        resultado = qtde * preco;

        System.out.printf("%nEntrada: %n");
        System.out.printf("%d %.0f %n",codigo, qtde);

        System.out.printf("%nSaída: %n");
        System.out.printf("Total: R$ %.2f %n",resultado);

        s.close();
    }
}
