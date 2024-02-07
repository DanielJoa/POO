package fundamentos;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaeSaida {
    public static void main(String[] args) {
        // primeira forma de entrada e saida de dados
        /*Scanner entrada = new Scanner(System.in);

        entrada.close();*/
        // segunda forma de entrada e saida de dados
        String nome;
        int idade;

        JOptionPane.showMessageDialog(null, "Exemplo de mensagem");

        nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) " + nome );
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua idade?"));
        JOptionPane.showMessageDialog(null, "A idade do(a) " + nome + " é " + idade + "anos", "Demonstração", JOptionPane.INFORMATION_MESSAGE);
        }
    
}
