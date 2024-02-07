package Lista3;
/*Faça um algoritmo que deixe escolher qual a tabuada de multiplicar que se deseja imprimir.  */

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite o número que deseja ver a tabela: ");
        num = teclado.nextInt();
        for (int i = 0; i<=10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
        
        teclado.close();
    }
}
