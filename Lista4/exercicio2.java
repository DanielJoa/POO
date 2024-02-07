package Lista4;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int choice;
        System.out.println("Digite o numero referente ao que deseja: \n1 - Criar Aluno \n2 - Mostrar Aluno \n3 - Sair");
        choice = teclado.nextInt();
        Person p1 = new Person();
        while (choice != 3 ){            
            if (choice == 1){
                System.out.println("Digite o seu RA: ");
                p1.setRa(teclado.next());
                System.out.println("Digite o seu Nome: ");
                p1.setNome(teclado.next());
                System.out.println("Digite a sua nota da AC1: ");
                p1.setAC1(teclado.nextFloat());
                System.out.println("Digite a sua nota da AC2: ");
                p1.setAC2(teclado.nextFloat());
                System.out.println("Digite a sua nota da AG: ");
                p1.setAG(teclado.nextFloat());
                System.out.println("Digite a sua nota da AF: ");
                p1.setAF(teclado.nextFloat());
                System.out.println("Digite o numero referente ao que deseja: \n1 - Criar Aluno \n2 - Mostrar Aluno \n3 - Sair");
                choice = teclado.nextInt();
            }
            if (choice == 2){
                System.out.println(p1.imprimir());
                System.out.println("Digite o numero referente ao que deseja: \n1 - Criar Aluno \n2 - Mostrar Aluno \n3 - Sair");
                choice = teclado.nextInt();
            }
        }
        teclado.close();
}
}
