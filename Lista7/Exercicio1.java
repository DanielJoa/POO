package Lista7;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        FuncionarioMensalista fm = new FuncionarioMensalista();
        FuncionarioHorista fh = new FuncionarioHorista();
        int choice = 0, escolha = 0;
        while (choice != 3){
            System.out.println("Menu: \n1- Inserir Funcionario \n2- Exibir Funcionario \n3- Sair ");
            choice = teclado.nextInt();
            if (choice == 1 ){
                System.out.println("1- Funcionario Horista \n2- Funcionario Mensalista ");
                escolha = teclado.nextInt();
                if(escolha == 1){
                    System.out.println("Digite o numero do cracha: ");
                    fh.setNumeroCracha(teclado.nextInt());
                    System.out.println("Digite o nome: ");
                    fh.setNome(teclado.next());
                    System.out.println("Digite o setor: ");
                    fh.setSetor(teclado.next());
                    System.out.println("Digite a função: ");
                    fh.setFuncao(teclado.next());
                    System.out.println("Digite a qtde de horas: ");
                    fh.setQtdeHoras(Integer.parseInt(teclado.next()));                 
                    System.out.println("Digite o valor da hora: ");
                    fh.setValorHora(teclado.nextDouble());
                    funcionarios.add(fh);
                }
                if(escolha == 2){
                    System.out.println("Digite o numero do cracha: ");
                    fm.setNumeroCracha(Integer.parseInt(teclado.next()));
                    System.out.println("Digite o nome: ");
                    fm.setNome(teclado.next());
                    System.out.println("Digite o setor: ");
                    fm.setSetor(teclado.next());
                    System.out.println("Digite a função: ");
                    fm.setFuncao(teclado.next());
                    System.out.println("Digite o Salario: ");
                    fm.setSalario(teclado.nextDouble());
                    funcionarios.add(fm);
                }
            }
            if (choice == 2 ){
                System.out.println("1- Funcionario Horista \n2- Funcionario Mensalista ");
                escolha = teclado.nextInt();
                if(escolha == 1){
                    System.out.println(fh.imprimir());
                }
                if(escolha == 2){
                    System.out.println(fm.imprimir());
                }
            }
            if (choice == 3 ){
                System.out.println("Saindo...");
            }
        }



        teclado.close();
    }
}