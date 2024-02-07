package Revisao;

import java.util.Scanner;


public class Lista5ex3 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        Vendedor v1 = new Vendedor();
        int choice = 0;
        double valorVenda=0, desconto=0;
        while (choice != 3){
            System.out.println("Menu: \n1- Cadastrar Vendedor \n2- Calcular Comissão \n3- Sair");
            choice = tcd.nextInt();
            if (choice == 1 ) {
                //Cadastrar Vendedor
                System.out.println("Digite o codigo do vendedor: ");
                v1.setCodigo(tcd.nextInt());
                System.out.println("Digite o nome do vendedor: ");
                v1.setNome(tcd.nextLine());
                System.out.println("Percentual do vendedor: ");
                v1.setPercentual_comissao(tcd.nextDouble());
            }
            if (choice == 2 ) {
                //Calcular Comissão
                System.out.println("Qual o valor da venda: ");
                valorVenda = tcd.nextDouble();
                System.out.println("Digite o desconto: ");
                desconto = tcd.nextDouble();
                System.out.println(v1.imprimir(valorVenda, desconto));                    
            }
            if (choice == 3 ) {
                //Sair
                System.out.println("Saindo...");
            }
            else {
                System.out.println("Opção Invalida...");
            }
        }       
        tcd.close();
    }
}
