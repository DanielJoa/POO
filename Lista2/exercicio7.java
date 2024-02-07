package Lista2;
/*7)	Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:
Não eleitor (abaixo de 16 anos)
Eleitor obrigatório (entre 18 e 65 anos) 
Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos) 
 */

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        System.out.println("Digite a sua idade:");
        idade = teclado.nextInt();
        if (idade<16){
            System.out.println("O usuario tem " + idade + " e não pode ser eleitor ");
        }
        else if (16<= idade && idade<18 || idade>65){
            System.out.println("O usuario tem " + idade + " e é eleitor facultativo ");
        }
        else if (18 <= idade && idade<=65){
            System.out.println("O usuario tem " + idade + " e é eleitor obrigatório ");
        }
        teclado.close();
    }
}
