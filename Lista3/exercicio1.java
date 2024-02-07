package Lista3;
/*Ler três números e mostra-los em ordem do menor para o maior. O sistema pode aceitar números iguais */

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int maior = 0, menor = 0, meio = 0, num = 0;
        for (int i = 0; i < 3; i++){
            System.out.println("Digite o número: ");
            num = teclado.nextInt();
            if (i == 0){
                maior = num;
                menor = num;
                meio = num;
            }
            else if (num > maior){
                maior = num;
            }
            else if (num < menor){
                menor = num;
            }
            else {
                meio = num;
            }
        }
        System.out.println(menor + "," + meio + "," + maior);

        teclado.close();
    }
    
}
