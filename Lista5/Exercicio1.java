package Lista5;

import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        int choice = 0, escolha = 0;
        double num1 = 0, num2 = 0;
        int n1 = 0, n2 = 0;
        Scanner teclado = new Scanner(System.in);
        Calculadora c = new Calculadora();
        System.out.println("Menu: \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair");
        choice = teclado.nextInt();
        while (choice != 5){
            if (choice == 1){
                System.out.println("Menu: \n1 - Números inteiros \n2 - Números Racionais");
                escolha = teclado.nextInt();
                if (escolha == 1){
                    System.out.println("Digite o primeiro número: ");
                    n1 = teclado.nextInt();
                    System.out.println("Digite o segundo número: ");
                    n2 = teclado.nextInt();
                    System.out.println(c.Soma(n1, n2));
                }
                if (escolha == 2){
                    System.out.println("Digite o primeiro número: ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    num2 = teclado.nextDouble();
                    System.out.println(c.soma(num1, num2));
                }
                System.out.println("Menu: \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair");
                choice = teclado.nextInt();                
            }
            if (choice == 2){
                System.out.println("Menu: \n1 - Números inteiros \n2 - Números Racionais");
                escolha = teclado.nextInt();
                if (escolha == 1){
                    System.out.println("Digite o primeiro número: ");
                    num1 = teclado.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = teclado.nextInt();
                    System.out.println(c.Subtracao(n1, n2));
                }
                if (escolha == 2){
                    System.out.println("Digite o primeiro número: ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    num2 = teclado.nextDouble();
                    System.out.println(c.subtracao(num1, num2));
                }
                System.out.println("Menu: \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair");
                choice = teclado.nextInt();               
            }
            if (choice == 3){
                System.out.println("Menu: \n1 - Números inteiros \n2 - Números Racionais");
                escolha = teclado.nextInt();
                if (escolha == 1){
                    System.out.println("Digite o primeiro número: ");
                    num1 = teclado.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = teclado.nextInt();
                    System.out.println(c.Multiplicacao(n1, n2));
                }
                if (escolha == 2){
                    System.out.println("Digite o primeiro número: ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    num2 = teclado.nextDouble();
                    System.out.println(c.multiplicacao(num1, num2));
                }
                System.out.println("Menu: \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair");
                choice = teclado.nextInt();               
            }
            if (choice == 4){
                System.out.println("Menu: \n1 - Números inteiros \n2 - Números Racionais");
                escolha = teclado.nextInt();
                if (escolha == 1){
                    System.out.println("Digite o primeiro número: ");
                    num1 = teclado.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = teclado.nextInt();
                    System.out.println(c.Divisao(n1, n2));
                }
                if (escolha == 2){
                    System.out.println("Digite o primeiro número: ");
                    num1 = teclado.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    num2 = teclado.nextDouble();
                    System.out.println(c.divisao(num1, num2));
                }
                System.out.println("Menu: \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair");
                choice = teclado.nextInt();               
            }
            if (choice == 5){
                System.out.println("O programa será encerrado");
            }
        }
        teclado.close();
    }
}