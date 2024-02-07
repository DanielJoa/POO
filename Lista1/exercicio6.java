package Lista1;
/*Desenvolver um programa utilizando os conceitos de variáveis para resolver a expressão matemática abaixo sendo que o resultado é 125. */

public class exercicio6 {
    public static void main(String[] args) {
       double x,y,z,w,resultado;
       x = Math.pow(6*(3+2),2);
       y = Math.pow(((1-5)*(2-7)/2),2);
       z = Math.pow((x/(3*2)-y),3);
       w = Math.pow(10,3);
       resultado = z/w;
       System.out.println("O resultado do calculo é " + resultado);
    }
}
