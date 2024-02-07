package Lista1;
/*Receba a altura e a largura e a partir dessa informação calcule a área o e perímetro de um retângulo, onde:
área = base * altura
perímetro = 2base + 2altura
 */

import java.util.Scanner;

public class exercicio4{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float base, altura, area, perimetro ;
        System.out.println("Digite a base do retangulo:");
        base = teclado.nextFloat();
        System.out.println("Digite a altura do retangulo:");
        altura = teclado.nextFloat();
        area = base * altura;
        perimetro = (2*base) + (2*altura);
        System.out.println("O retangulo com base: " + base + " e altura: " + altura + "\nTem uma area de: " + area + " e perimetro de: " + perimetro);
        teclado.close();
    }
}