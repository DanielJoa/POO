package Lista7;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

public static void main(String[] args) {
        ArrayList<ImovelNovo> imn = new ArrayList<>();
        ArrayList<ImovelVelho> imv = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int choice = 0, escolha = 0;
        while (choice != 3){
            System.out.println("Menu: \n1- Inserir Imóvel \n2- Exibir Imóveis \n3- Sair ");
            choice = teclado.nextInt();
            if (choice == 1 ){
                System.out.println("1- Imóvel Novo \n2- Imóvel Velho ");
                escolha = teclado.nextInt();
                if(escolha == 1){
                    ImovelNovo in = new ImovelNovo();
                    System.out.println("Digite o codigo: ");
                    in.setCodigo(teclado.nextInt());
                    System.out.println("Digite o endereço: ");
                    in.setEndereço(teclado.next());
                    System.out.println("Digite o valor a ser adicionado: ");
                    in.setValorAdicional(teclado.nextDouble());
                    imn.add(in);
                }
                if(escolha == 2){
                    ImovelVelho iv = new ImovelVelho();
                    System.out.println("Digite o codigo: ");
                    iv.setCodigo(teclado.nextInt());
                    System.out.println("Digite o endereço: ");
                    iv.setEndereço(teclado.next());
                    System.out.println("Digite o valor a ser descontado: ");
                    iv.setValorDesconto(teclado.nextDouble());
                    imv.add(iv);
                }
            }
            if (choice == 2 ){
                System.out.println("--------------------");
                System.out.println("Imovel Novo");
                System.out.println("--------------------");
                for (ImovelNovo imovelnovo : imn) {
                    System.out.println(imovelnovo.imprimir());
                }
                System.out.println("--------------------");
                System.out.println("Imovel Velho");
                System.out.println("--------------------");
                for (ImovelVelho imovelvelho : imv) {
                    System.out.println(imovelvelho.imprimir());
                }
                
            }
            if (choice == 3 ){
                System.out.println("Saindo...");
            }
        }



        teclado.close();
    }
}
