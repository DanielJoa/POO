package Lista5;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Vendedor v1 = new Vendedor();
        int choice = 0; 
        double valor_Venda = 0, valor_Desconto = 0;
        System.out.println("Menu: \n1 - Criar Vendedor \n2 - Calcular Comissão \n3 - Sair ");
        choice = cs.nextInt();
        while (choice != 3){
            if (choice == 1){
                System.out.println("Digite o Codigo: ");
                v1.setCodigo(cs.nextInt());
                System.out.println("Digite seu nome: ");
                v1.setNome(cs.next());
                System.out.println("Digite o percentual de comissão: ");
                v1.setPercentual_comissao(cs.nextDouble());
                System.out.println("Menu: \n1 - Criar Vendedor \n2 - Calcular Comissão \n3 - Sair ");
                choice = cs.nextInt();
            }
            if (choice == 2){
                Vendedor.qntd_vendedores++;
                System.out.println("Digite o valor da venda: ");
                valor_Venda = cs.nextDouble();
                System.out.println("Digite o valor do desconto: ");
                valor_Desconto = cs.nextDouble();
                System.out.println(v1.imprimir(valor_Venda, valor_Desconto));
                System.out.println("Vendedores criados: " + Vendedor.qntd_vendedores);
                System.out.println("Menu: \n1 - Criar Vendedor \n2 - Calcular Comissão \n3 - Sair ");
                choice = cs.nextInt();
            }
            if (choice == 3){
                System.out.println("Programa sendo encerrado");
            }
            else { 
                System.out.println("Opção Inválida");;
            }
        }
        cs.close();
    }
}
