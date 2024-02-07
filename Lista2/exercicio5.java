package Lista2;
/*Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00 caso contrário, o lucro será de 30%. Entrar com o valor do produto e imprimir o valor da venda. */

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valor_da_compra, valor_de_venda;
        System.out.println("Digite o valor da compra do produto");
        valor_da_compra = teclado.nextFloat();
        if (valor_da_compra<20){
            valor_de_venda = (float) (valor_da_compra * 1.45);
            System.out.println("O valor de venda é " + valor_de_venda);
        }
        else {
            valor_de_venda = (float) (valor_da_compra * 1.30);
            System.out.println("O valor de venda é " + valor_de_venda);
        }
        teclado.close();
    }
}
