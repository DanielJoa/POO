package Lista3;
/*Entrar com 20 números e imprimir a soma desses números. */

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0, num = 0;
        for (int i = 0; i<20; i++){
            System.out.println("Digite o número");
            num = teclado.nextInt();
            soma = soma + num;
        }
        System.out.println("A soma dos números digitados é: " + soma);
        teclado.close();
    }
}
