package Lista4;

import java.util.Scanner;


public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int choice;
        System.out.println("Digite o numero referente ao que deseja: \n1 - Criar Pessoa \n2 - Mostrar Pessoa \n3 - Sair");
        choice = teclado.nextInt();
        pessoa p1 = new pessoa();
        while (choice != 3 ){            
            if (choice == 1){
                System.out.println("Digite o seu CPF: ");
                p1.setCpf(teclado.next());
                System.out.println("Digite o seu Nome: ");
                p1.setNome(teclado.next());
                System.out.println("Digite o seu Idade: ");
                p1.setIdade(teclado.nextInt());
                System.out.println("Digite o seu Sexo onde M - masculino e F - feminino: ");
                p1.setSexo(teclado.next().charAt(0));
                System.out.println("Digite o numero referente ao que deseja: \n1 - Criar Pessoa \n2 - Mostrar Pessoa \n3 - Sair");
                choice = teclado.nextInt();
            }
            if (choice == 2){
                System.out.println(p1.imprimir());
                System.out.println("Digite o numero referente ao que deseja: \n1 - Criar Pessoa \n2 - Mostrar Pessoa \n3 - Sair");
                choice = teclado.nextInt();
            }
        }
        teclado.close();
}
}
