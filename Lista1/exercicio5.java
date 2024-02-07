package Lista1;
/*Ler uma temperatura em graus Centígrados e apresentá-la convertida em graus Fahrenheit.
 A fórmula de conversão é: F = (9*C+160)/5. Onde F é a temperatura em Fahrenheit e C é a temperatura em Centígrados. */

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int graus_celsius, graus_fahrenheit;
        System.out.println("Digite a temperatura em celsius:");
        graus_celsius = teclado.nextInt();
        graus_fahrenheit = ((9*graus_celsius + 160)/5);
        System.out.println(graus_celsius + "°C se equivale a " + graus_fahrenheit + "°F");
        teclado.close();
    }
}
