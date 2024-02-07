package Lista2;
/*Entrar com 5 números e mostrar na saída qual é o menor e qual e o maior número. */

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("Digite o valor de A:");
        a = teclado.nextInt();
        System.out.println("Digite o valor de B:");
        b = teclado.nextInt();
        System.out.println("Digite o valor de C:");
        c = teclado.nextInt();
        System.out.println("Digite o valor de D:");
        d = teclado.nextInt();
        System.out.println("Digite o valor de E:");
        e = teclado.nextInt();
        if (a>b && a>c && a>d && a>e){
            System.out.println("O maior número é: " + a);
        }
        if (a<b && a<c && a<d && a<e){
            System.out.println("O menor número é: " + a);
        }
        if (b>a && b>c && b>d && b>e){
            System.out.println("O maior número é: " + b);
        }
        if (b<a && b<c && b<d && b<e){
            System.out.println("O menor número é: " + b);
        }
        if (c>a && c>b && c>d && c>e){
            System.out.println("O maior número é: " + c);
        }
        if (c<a && c<b && c<d && c<e){
            System.out.println("O menor número é: " + c);
        }
        if (d>a && d>b && d>c && d>e){
            System.out.println("O maior número é: " + d);
        }
        if (d<a && d<b && d<c && d<e){
            System.out.println("O menor número é: " + d);
        }
        if (e>a && e>b && e>c && e>d){
            System.out.println("O maior número é: " + e);
        }
        if (e<a && e<b && e<c && e<d){
            System.out.println("O menor número é: " + e);
        }
        teclado.close();
    }
}
