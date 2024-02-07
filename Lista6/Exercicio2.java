package Lista6;

import java.util.Scanner;
import java.util.ArrayList;



public class Exercicio2 {
    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int choice = 0;

        while (choice != 6){
            System.out.println("Menu: \n1 - Criar Pessoa \n2 - Criar Automovel \n3 - Transferir Automovel \n4 - Mostrar Todas as Pessoas    \n5 - Mostrar automóvel da pessoa \n6 - Sair");
            choice = tec.nextInt();
            if (choice == 1){
                opcao1();
            }
    
            if (choice == 2){
                opcao2();
            }
    
            if (choice == 3){
                opcao3();
            }
    
            if (choice == 4){   
                opcao4();
            }
    
            if (choice == 5){
                opcao5();
            }
            if (choice == 6){
                System.out.println("Programa sendo encerrado... \nBye bye.");
            }
    
            else{
                System.out.println("Opção inválida");
            }
        }
        tec.close();
    }
    public static void opcao1(){
        Scanner tec = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.println("Digite o codigo da pessoa");
        p.setCodigo(Integer.parseInt(tec.nextLine()));
        System.out.println("Digite o nome da pessoa");
        p.setNome(tec.nextLine());
    }
    public static void opcao2(){
        Scanner tec = new Scanner(System.in);
        Automovel a = new Automovel();
        System.out.println("Digite a marca do automovel");
        a.setMarca(tec.nextLine());
        System.out.println("Digite o modelo do automovel");
        a.setModelo(tec.nextLine());
        System.out.println("Digite o codigo do dono do automovel");
        int CodEscolhido = Integer.parseInt(tec.nextLine());
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == CodEscolhido){
                pessoa.inserirAutomovel(a);
            }
        }
    }
    public static void opcao3(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o codigo do dono");
        int codPessoa = Integer.parseInt(tec.nextLine());
        System.out.println("Digite o codigo do comprador");
        int codComprador = Integer.parseInt(tec.nextLine());
        //pvenda - mostrar os carros
        Pessoa pvenda = new Pessoa();
        for (Pessoa pessoa : pessoas) {
            if (codPessoa == pessoa.getCodigo()){
                pvenda = pessoa;
            }
        }
        Pessoa pcompra = new Pessoa();
        for (Pessoa pessoa : pessoas) {
            if (codPessoa == pessoa.getCodigo()){
                pcompra = pessoa;
            }
        }
        //guardar o carro escolhido
        System.out.println("Escolha o modelo a ver vendido");
        for (Automovel auto : pvenda.getAutomoveis()) {
            System.out.println(auto.imprimir());
        }
        String modeloEscolhido = tec.nextLine();
        Automovel autoEscolhido = new Automovel();
        for (Automovel auto : pvenda.getAutomoveis()) {
            if(modeloEscolhido == auto.getModelo()){
                autoEscolhido = auto;
            }
        }
        int index = pvenda.getAutomoveis().indexOf(autoEscolhido);
        pvenda.removerAutomovel(index);

        pcompra.inserirAutomovel(autoEscolhido);

    }
    public static void opcao4(){
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.imprimir());
        }
    }
    public static void opcao5(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o codigo da pessoa");
        int codPessoa = Integer.parseInt(tec.nextLine());
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codPessoa){
                pessoa.imprimirCompleto();
            }
        }
    }
}
