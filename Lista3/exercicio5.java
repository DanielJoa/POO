package Lista3;
/*Faça um programa onde você consiga jogar joquempô com o computador seguindo as seguintes regras:
•	Crie um menu para que o jogador escolha uma dessas duas opções: 0 – Pedra | 1 – Papel | 2 – Tesoura
•	O jogador deve escolher uma opção e o jogador também, após a escolha dos dois mostre a mensagem de quem ganhou
•	O jogo deve acontecer 3 vezes e após o término das três partidas o programa deve mostrar o placar a avisar quem ganhou.
 */

import java.util.Random;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont_humano = 0, cont_maq = 0, num = 0, temp = 0, emp = 0;
        Random a = new Random();
        for (int i = 0; i<3; i++){
            if (i == 0){
            System.out.println("Vamos jogar joquempô \n0 para pedra, 1 para papel e 2 para tesoura \nEscolha:");
            num = teclado.nextInt();
            }
            else {
            System.out.println("Escolha novamente:");
            num = teclado.nextInt();
            }
            temp = a.nextInt(3);
            if (temp == 0){
                if (num == 0){
                    System.out.println("Deu empate");
                    emp ++;
                }
                else if (num == 1){
                    System.out.println("O humano ganhou, pois a maquina escolheu " + temp);
                    cont_humano ++;
                }
                else {
                    System.out.println("A maquina ganhou,pois a maquina escolheu " + temp);
                    cont_maq ++;
                }
            }
            if (temp == 1){
                if (num == 0){
                    System.out.println("A maquina ganhou,pois a maquina escolheu " + temp);
                    cont_maq ++;
                }
                else if (num == 1){
                    System.out.println("Deu empate");
                    emp ++;
                }
                else {
                    System.out.println("O humano ganhou,pois a maquina escolheu " + temp);
                    cont_humano ++;
                }
            }
                if (temp == 2){
                    if (num == 0){
                        System.out.println("O humano ganhou,pois a maquina escolheu " + temp);
                        cont_humano ++;
                    }
                    else if (num == 1){
                        System.out.println("A maquina ganhou,pois a maquina escolheu " + temp);
                        cont_maq ++;
                    }
                    else {
                        System.out.println("Deu empate");
                        emp ++;
                    }
                }
            }
            System.out.println("Na melhor de 3 \nA maquina obteve: " + cont_maq + " vitorias \nO humano obteve: " + cont_humano + " vitorias \ne teve: " + emp + " empates");
            teclado.close();
        }
    }
