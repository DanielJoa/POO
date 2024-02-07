package Lista4;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int choice;
        System.out.println("Digite o numero referente ao que deseja: \n1 - Criar funcionario \n2 - Mostrar Salário \n3 - Alterar Remuneração \n4 - Sair");
        choice = teclado.nextInt();
        Objeto p1 = new Objeto();
        while (choice != 4 ){
            if (choice == 1){
                System.out.println("Digite o seu Crachá: ");
                p1.setcracha(teclado.nextInt());
                System.out.println("Digite o seu Nome: ");
                p1.setnome(teclado.next());
                System.out.println("Digite o seu Tipo de Vinculo (H - se for por carga horaria): ");
                p1.settipo_vinculo(teclado.next().charAt(0));
                System.out.println("Digite o seu Valor por hora trabalhada: ");
                p1.setvalor_hora(teclado.nextFloat());
                System.out.println("Digite a sua quantidade de hora trabalhada: ");
                p1.setqntd_hora(teclado.nextFloat());
                System.out.println("Digite o seu Salario: ");
                p1.setsalario(teclado.nextFloat());
                System.out.println("Digite o valor do desconto: ");
                p1.setvalor_desconto(teclado.nextFloat());
                System.out.println("Digite o numero referente ao que deseja: \n1 - Criar funcionario \n2 - Mostrar Salário \n3 - Alterar Remuneração \n4 - Sair");
                choice = teclado.nextInt();
            }
            if (choice == 2){
                System.out.println(p1.imprimir());
                System.out.println("Digite o numero referente ao que deseja: \n1 - Criar funcionario \n2 - Mostrar Salário \n3 - Alterar Remuneração \n4 - Sair");
                choice = teclado.nextInt();
            }
            if (choice == 3){
                System.out.println("Digite o seu Tipo de Vinculo (H - se for por carga horaria): ");
                p1.settipo_vinculo(teclado.next().charAt(0));
                System.out.println("Digite o seu Valor por hora trabalhada: ");
                p1.setvalor_hora(teclado.nextFloat());
                System.out.println("Digite a sua quantidade de hora trabalhada: ");
                p1.setqntd_hora(teclado.nextFloat());
                System.out.println("Digite o seu Salario: ");
                p1.setsalario(teclado.nextFloat());
                System.out.println("Digite o valor do desconto: ");
                p1.setvalor_desconto(teclado.nextFloat());
                System.out.println("Digite o numero referente ao que deseja: \n1 - Criar funcionario \n2 - Mostrar Salário \n3 - Alterar Remuneração \n4 - Sair");
                choice = teclado.nextInt();
            }
        }
        teclado.close();
    }
}
