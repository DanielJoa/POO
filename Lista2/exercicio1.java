package Lista2;

import java.util.Scanner;

/*Faça um programa que leia 2 números e imprima uma mensagem dizendo se são iguais ou diferentes. */
public class exercicio1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x,y;
        System.out.println("Digite um número: ");
        x = teclado.nextFloat();
        System.out.println("Digite um número: ");
        y = teclado.nextFloat();
        if (x == y){
            System.out.println("Os números são iguais");
        }
        else{
            System.out.println("Os números infelizmente não são iguais onde \nx = " + x + "\ny = " + y);
        }
        teclado.close();
    }
}