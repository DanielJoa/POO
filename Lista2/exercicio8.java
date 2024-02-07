package Lista2;
/*Ler um número entre 1 e 12, e escrever o mês correspondente.   Caso o usuário digite um número fora deste intervalo, deverá aparecer uma mensagem, informando que não existe mês com este número. */

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;
        System.out.println("Digite um numero de 1 a 12:");
        mes = teclado.nextInt();
        if (mes == 1) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de janeiro");
        }
        else if (mes == 2) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de fevereiro");
        }
        else if (mes == 3) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de março");
        }
        else if (mes == 4) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de abril");
        }
        else if (mes == 5) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de maio");
        }
        else if (mes == 6) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de junho");
        }
        else if (mes == 7) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de julho");
        }
        else if (mes == 8) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de agosto");
        }
        else if (mes == 9) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de setembro");
        }
        else if (mes == 10) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de outubro");
        }
        else if (mes == 11) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de novembro");
        }
        else if (mes == 12) {
            System.out.println("O mes correspondente ao numero " + mes + " é o mes de dezembro");
        }
        else if (mes == 0 || mes > 12){
            System.out.println("Mes invalido");
        }
        teclado.close();
    }
}
