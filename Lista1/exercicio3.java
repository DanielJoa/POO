package Lista1;
/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12km por litro. Para obter o cálculo o usuário deve fornece o tempo gasto na viagem e a velocidade média durante ela.
Dessa forma será possível obter a distância percorrida com a fórmula
DISTANCIA = TEMPO * VELOCIDADE
Tendo o valor da distância basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
LITROS_USADOS = DISTANCIA /12
O programa deve apresentar os valores da velocidade média, tempo gasto da viagem, a distância percorrida e a quantidade de litros utilizada.
 */

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tempo_viagem, velocidade_media, distancia, litros_usados;
        System.out.println("Digite o tempo da viagem:");
        tempo_viagem = teclado.nextInt();
        System.out.println("Digite a velocidade média da viagem:");
        velocidade_media = teclado.nextInt();
        distancia = tempo_viagem*velocidade_media;
        litros_usados = distancia/12;
        System.out.println("Com a velocidade média de " + velocidade_media + " km/h e " + tempo_viagem + "h de viagem, foi percorrido a distancia de " + distancia + " km e foi utilizado " + litros_usados + "L do tanque.");
        teclado.close();;    
    }
}
