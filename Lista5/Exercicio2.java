package Lista5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Apolice a1 = new Apolice();
        int choice = 0;
        System.out.println("Menu: \n1 - Criar Apólice \n2 - Ver dados da Apólice \n3 - Sair ");
        choice = cs.nextInt();
        while (choice != 3){
            if (choice == 1){
                System.out.println("Digite o número: ");
                a1.setNumero(cs.nextInt());
                System.out.println("Digite seu nome: ");
                a1.setNome(cs.next());
                System.out.println("Digite sua idade: ");
                a1.setIdade(cs.nextInt());
                System.out.println("Sexo \nM - Masculino \nF - Feminino");
                a1.setSexo(cs.next().charAt(0));
                System.out.println("Digite o valor do automovel: ");
                a1.setValor_automovel(cs.nextDouble());
                System.out.println("Menu: \n1 - Criar Apólice \n2 - Ver dados da Apólice \n3 - Sair ");
                choice = cs.nextInt();
            }
            if (choice == 2){
                System.out.println(a1.imprimir());
                System.out.println("Menu: \n1 - Criar Apólice \n2 - Ver dados da Apólice \n3 - Sair ");
                choice = cs.nextInt();
            }
            if (choice == 3){
                System.out.println("Programa sendo encerrado");
            }
            else {System.out.println("Opção Inválida");}
        }
        cs.close();
    }
}
