package Lista2;

import java.util.Scanner;
/*Entrar com dois números e imprimi-los em ordem crescente (suponha números diferentes).*/

public class exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x,y;
        System.out.println("Digite um número: ");
        x = teclado.nextFloat();
        System.out.println("Digite um número: ");
        y = teclado.nextFloat();
        if (x > y){
            System.out.println(x + "\n"+y);
        }
        else {
            System.out.println(y +"\n"+x);
        }

        teclado.close();
    }
}
