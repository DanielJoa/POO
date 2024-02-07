package Lista2;
/*Entrar com um número e informar se ele é divisível por 10, ou é divisível por 5, ou é divisível por 2 ou se não é divisível por nenhum destes.*/

import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
        if (num%10 == 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é divisivel por 10");
        }
        else if (num%5 == 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é divisivel por 5");
        }
        else if (num%2 == 0){
                JOptionPane.showMessageDialog(null, "O número " + num + " é divisivel por 2");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número não é divisivel por 2, 5 ou 10");
        }

    }
}
