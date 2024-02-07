package Lista2;
/*Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido */

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano_de_nascimento,idade;
        System.out.println("Digite seu ano de nascimento:");
        ano_de_nascimento = teclado.nextInt();
        idade = 2022 - ano_de_nascimento; 
        System.out.println("O usuário que nasceu no ano " + ano_de_nascimento + " tem " + idade + " Anos");
        teclado.close();
    }
}
