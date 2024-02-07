package Lista1;
/*Ler os valores de comprimento, largura e altura e apresentar o valor do volume de uma caixa retangular. Utilize para o cálculo a formula
Volume = comprimento * largura * altura
 */
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float volume, comprimento, largura, altura;
        System.out.println("Digite o comprimento da caixa:");
        comprimento = teclado.nextFloat();
        System.out.println("Digite a largura da caixa:");
        largura = teclado.nextFloat();
        System.out.println("Digite a altura da caixa:");
        altura = teclado.nextFloat();
        volume = comprimento*largura*altura;
        System.out.println("O volume é : " + volume);
        teclado.close();

    }    
}