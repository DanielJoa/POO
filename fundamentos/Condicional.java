package fundamentos;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int numero;
        // condicional Se
        // Se simples
        System.out.println("Digite seu nome:");
        nome = teclado.nextLine();
        System.out.println("Digite um numero:");
        numero = teclado.nextInt();

        if(nome.toLowerCase().contains("eds")){
            System.out.println("O nome começa com as letras EDS ");
        }

        // condicional Se composto
        if (numero == 10){
            System.out.println("O número é igual a 10");
        }
        else {
            System.out.println("O número é diferente de 10");
        }

        // Condicional Se encadeado
        if (numero == 10){
            System.out.println("Número é igual a 10");
        }
        else if (numero == 15){
            System.out.println("Número igual a 15");
        }
        else if (numero >20){
            System.out.println("Maior que 20");
        }
        else {
            System.out.println("Não definido");
        }
        // Condicional Switch
        switch (numero){
            case 10:
            System.out.println("Igual a 10");
            break;
            case 15:
            System.out.println("Igual a 15");
            break;
        default:
        System.out.println("Não definido");
        }
        teclado.close();

    }
}
