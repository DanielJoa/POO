package Lista3;
/*Entrar com 20 números e imprimir a soma dos positivos e o total de números negativos.*/

import java.util.Scanner;

public class exercicio3 {
  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0, num = 0, cont = 0;
        for (int i = 0; i<20; i++){
            System.out.println("Digite o número:");
            num = teclado.nextInt();
            if (num > 0){
            soma = soma + num;
        }
        else {
            cont ++;
        }
        }
        System.out.println("A soma dos números positivos é: " + soma + " temos " + cont + " numeros negativos");
        teclado.close();
    }
}
